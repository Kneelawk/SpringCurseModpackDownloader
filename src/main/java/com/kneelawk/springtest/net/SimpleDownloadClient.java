package com.kneelawk.springtest.net;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Consumer;

/**
 * Created by Kneelawk on 8/11/19.
 */
public class SimpleDownloadClient implements DownloadClient {
    private static Logger log = LoggerFactory.getLogger(SimpleDownloadClient.class);

    private final WebClient client;

    public SimpleDownloadClient(WebClient client) {
        this.client = client;
    }

    @Override
    public Mono<Void> download(String downloadURI, String displayName, long contentLength, Path outputFile,
                               Consumer<ProgressEvent> progressListener) {
        return client.get().uri(downloadURI).exchange().flatMap(clientResponse -> {
            log.debug("Starting download: " + displayName);
            log.debug("Status: " + clientResponse.statusCode());

            long contentLengthHeader = clientResponse.headers().contentLength().orElse(contentLength);

            Flux<DataBuffer> inputChannel = clientResponse.bodyToFlux(DataBuffer.class);

            Mono<AsynchronousFileChannel> outputChannel = Mono.fromCallable(() -> AsynchronousFileChannel
                    .open(outputFile, StandardOpenOption.WRITE, StandardOpenOption.CREATE));

            return outputChannel.flatMap(
                    channel -> DataBufferUtils.write(inputChannel, channel)
                            .doOnNext(new DownloadProgressUpdater(progressListener, contentLengthHeader, displayName))
                            .map(DataBufferUtils::release)
                            .doOnTerminate(() -> {
                                log.debug("Closing channel...");
                                try {
                                    channel.close();
                                } catch (IOException e) {
                                    log.debug("Error closing channel", e);
                                    throw new RuntimeException(e);
                                }
                            }).then());
        });
    }

    private static class DownloadProgressUpdater implements Consumer<DataBuffer> {
        private final Consumer<ProgressEvent> progressCallback;
        private final long max;
        private final String displayName;
        private long current = 0;

        DownloadProgressUpdater(
                Consumer<ProgressEvent> progressCallback, long max, String displayName) {
            this.progressCallback = progressCallback;
            this.max = max;
            this.displayName = displayName;
        }

        private void sendProgressUpdate() {
            progressCallback.accept(ProgressEvent.createDownloadKb(current, max, displayName));
        }

        @Override
        public void accept(DataBuffer dataBuffer) {
            current += dataBuffer.readableByteCount();
            sendProgressUpdate();
        }
    }
}

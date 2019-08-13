package com.kneelawk.springtest.net;

import reactor.core.publisher.Mono;

import java.nio.file.Path;
import java.util.function.Consumer;

/**
 * Created by Kneelawk on 8/11/19.
 */
public interface DownloadClient {
    Mono<Void> download(String downloadURI, String displayName, long contentLength, Path outputFile,
                        Consumer<ProgressEvent> progressListener);
}

package com.kneelawk.springtest.curse;

import com.kneelawk.springtest.json.FileJson;
import com.kneelawk.springtest.net.CurseAPI;
import com.kneelawk.springtest.net.DownloadClient;
import com.kneelawk.springtest.net.ProgressEvent;
import reactor.core.publisher.Mono;

import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * Created by Kneelawk on 8/4/19.
 */
public class CurseTaskFactory {
    private final DownloadClient downloadClient;
    private final CurseAPI api;

    public CurseTaskFactory(DownloadClient downloadClient, CurseAPI api) {
        this.downloadClient = downloadClient;
        this.api = api;
    }

    public Mono<ModDownloadResult> modDownload(long projectID, long fileID, Path modsDir,
                                               Consumer<ProgressEvent> progressListener) {
        return Mono
                .fromRunnable(() -> progressListener
                        .accept(ProgressEvent.createDownloadKb(-1, -1, projectID + "/" + fileID)))
                .then(api.getAddonFileInformation(projectID, fileID))
                .flatMap((addonFile) -> {
                    String displayName = addonFile.getDisplayName();
                    long fileLength = addonFile.getFileLength();

                    progressListener.accept(ProgressEvent.createDownloadKb(0, fileLength, displayName));

                    Path modFile = modsDir.resolve(addonFile.getFileName());
                    return downloadClient
                            .download(addonFile.getDownloadUrl(), displayName, fileLength, modFile, progressListener)
                            .then(Mono.just(new ModDownloadResult(addonFile, modFile)));
                });
    }

    public Mono<ModpackDownloadResult> modpackDownload(Modpack modpack, Path minecraftDir,
                                                       Consumer<ProgressEvent> progressListener) {
        List<FileJson> files = modpack.getManifest().getFiles();
        int modsCount = files.size();
        return Mono
                .fromRunnable(() -> progressListener
                        .accept(ProgressEvent.createDownloadMods(0, modsCount, modpack.getManifest().getName())))
                .then(Mono.create(sink -> {
                    AtomicInteger runningThreads = new AtomicInteger(0);
                    CountDownLatch modsDownloadedCountDown = new CountDownLatch(modsCount);
                }));
    }
}

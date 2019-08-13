package com.kneelawk.springtest.net;

import com.kneelawk.springtest.json.AddonFileJson;
import com.kneelawk.springtest.json.AddonJson;
import com.kneelawk.springtest.json.DetailedModloaderJson;
import com.kneelawk.springtest.json.SimpleModloaderJson;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * Created by Kneelawk on 8/4/19.
 */
public interface CurseAPI {
    Mono<AddonJson> getAddonInfo(long addonID);

    Mono<String> getAddonDescription(long addonID);

    Mono<String> getFileChangelog(long addonID, long fileID);

    Mono<AddonFileJson> getAddonFileInformation(long addonID, long fileID);

    Mono<URI> getAddonFileDownloadURL(long addonID, long fileID);

    Flux<AddonFileJson> getAddonFiles(long addonID);

    Mono<AddonFileJson> getAddonFileInformationOrLatest(long addonID, long fileID, String minecraftVersion);

    Flux<SimpleModloaderJson> getModloaderList();

    Mono<DetailedModloaderJson> getModloaderInfo(String versionName);
}

package com.kneelawk.springtest.net;

import com.kneelawk.springtest.json.AddonFileJson;
import com.kneelawk.springtest.json.AddonJson;
import com.kneelawk.springtest.json.DetailedModloaderJson;
import com.kneelawk.springtest.json.SimpleModloaderJson;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * Created by Kneelawk on 8/4/19.
 */
public class ForgeSVCAPI implements CurseAPI {
    private final WebClient client;

    public ForgeSVCAPI(WebClient client) {
        this.client = client;
    }

    @Override
    public Mono<AddonJson> getAddonInfo(long addonID) {
        return client.get().uri("/api/v2/addon/{addonID}", addonID).accept(MediaType.APPLICATION_JSON).retrieve()
                .bodyToMono(AddonJson.class);
    }

    @Override
    public Mono<String> getAddonDescription(long addonID) {
        return client.get().uri("/api/v2/addon/{addonID}/description", addonID).accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getFileChangelog(long addonID, long fileID) {
        return client.get().uri("/api/v2/addon/{addonID}/file/{fileID}/changelog", addonID, fileID)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<AddonFileJson> getAddonFileInformation(long addonID, long fileID) {
        return client.get().uri("/api/v2/addon/{addonID}/file/{fileID}", addonID, fileID)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(AddonFileJson.class);
    }

    @Override
    public Mono<URI> getAddonFileDownloadURL(long addonID, long fileID) {
        return client.get().uri("/api/v2/addon/{addonID}/file/{fileID}/download-url", addonID, fileID)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(URI.class);
    }

    @Override
    public Flux<AddonFileJson> getAddonFiles(long addonID) {
        return client.get().uri("/api/v2/addon/{addonID}/files", addonID).accept(MediaType.APPLICATION_JSON).retrieve()
                .bodyToFlux(AddonFileJson.class);
    }

    @Override
    public Mono<AddonFileJson> getAddonFileInformationOrLatest(long addonID, long fileID, String minecraftVersion) {
        return getAddonFileInformation(addonID, fileID).onErrorResume(Exception.class,
                e -> getAddonFiles(addonID).filter(a -> a.getGameVersion().contains(minecraftVersion))
                        .reduce((a, b) -> a.getFileDate().after(b.getFileDate()) ? a : b));
    }

    @Override
    public Flux<SimpleModloaderJson> getModloaderList() {
        return client.get().uri("/api/v2/minecraft/modloader").accept(MediaType.APPLICATION_JSON).retrieve()
                .bodyToFlux(SimpleModloaderJson.class);
    }

    @Override
    public Mono<DetailedModloaderJson> getModloaderInfo(String versionName) {
        return client.get().uri("/api/v2/minecraft/modloader/{VersionName}", versionName)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(DetailedModloaderJson.class);
    }
}

package com.kneelawk.springtest.curse;

import com.kneelawk.springtest.net.CurseAPI;
import com.kneelawk.springtest.net.DownloadClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kneelawk on 8/4/19.
 */
@Configuration
public class CurseTaskFactoryConfig {
    private final DownloadClient downloadClient;
    private final CurseAPI api;

    public CurseTaskFactoryConfig(DownloadClient downloadClient, CurseAPI api) {
        this.downloadClient = downloadClient;
        this.api = api;
    }

    @Bean
    public CurseTaskFactory modDownloadTaskFactory() {
        return new CurseTaskFactory(downloadClient, api);
    }
}

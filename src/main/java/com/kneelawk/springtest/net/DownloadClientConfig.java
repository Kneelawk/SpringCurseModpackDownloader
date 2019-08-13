package com.kneelawk.springtest.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by Kneelawk on 8/11/19.
 */
@Configuration
public class DownloadClientConfig {
    private final WebClient webClient;

    public DownloadClientConfig(@Qualifier("webClient") WebClient webClient) {
        this.webClient = webClient;
    }

    @Bean
    public DownloadClient downloadClient() {
        return new SimpleDownloadClient(webClient);
    }
}

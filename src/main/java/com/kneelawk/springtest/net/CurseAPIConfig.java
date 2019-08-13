package com.kneelawk.springtest.net;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by Kneelawk on 8/4/19.
 */
@Configuration
public class CurseAPIConfig {
    private final WebClient baseClient;

    public CurseAPIConfig(@Qualifier("webClient") WebClient baseClient) {
        this.baseClient = baseClient;
    }

    @Bean("forgeSVCWebClient")
    public WebClient forgeSVCWebClient() {
        return baseClient.mutate().baseUrl("https://addons-ecs.forgesvc.net").build();
    }

    @Bean
    public CurseAPI forgeSVCAPI() {
        return new ForgeSVCAPI(forgeSVCWebClient());
    }
}

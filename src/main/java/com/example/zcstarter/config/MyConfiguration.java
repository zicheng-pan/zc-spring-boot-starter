package com.example.zcstarter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    @ConditionalOnNotWebApplication
    public HelloworldService getMsg() {
        return new HelloworldService();
    }

}

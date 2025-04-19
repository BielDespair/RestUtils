package com.leonel.RestUtils.config;


import com.leonel.RestUtils.service.ViaCepService;
import feign.Contract;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class RestUtilsConfig {

    @Bean @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Random random() {
        return new Random();
    }
}

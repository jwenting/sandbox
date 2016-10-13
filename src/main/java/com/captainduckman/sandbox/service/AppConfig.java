package com.captainduckman.sandbox.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JeroenWenting on 13-Oct-16.
 */
@Configuration
public class AppConfig {

    @Value("${spring.application.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}

package com.captainduckman.sandbox.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Just a test class for the behaviour of injected config values in jUnit tests.
 */
@Configuration
public class AppConfig {

    @Value("${spring.application.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}

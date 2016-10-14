package com.captainduckman.sandbox.service;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * AppConfig Tester.
 *
 * @version 1.0
 * @since <pre>Oct 13, 2016</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ContextConfiguration(classes = { AppConfig.class }, initializers = ConfigFileApplicationContextInitializer.class)
public class AppConfigTest {

    @Autowired
    AppConfig config;

    @Value("${spring.application.name}")
    private String appName;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getAppName()
     */
    @Test
    public void testGetAppName() throws Exception {
        assertEquals("Incorrect value injected", appName, config.getAppName());
    }


} 

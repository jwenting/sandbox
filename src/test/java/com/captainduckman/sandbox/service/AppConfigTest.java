package com.captainduckman.sandbox.service;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AppConfig Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Oct 13, 2016</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class }, initializers = ConfigFileApplicationContextInitializer.class)
public class AppConfigTest {

    @Autowired
    AppConfig config;

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
        System.err.println(config.getAppName());
    }


} 

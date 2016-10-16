package com.captainduckman.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The application bootstrapper.
 */
@SpringBootApplication
public class SandboxApplication {

	/**
	 * Add CORS filter to the application.
	 * @return configuration
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")
						.allowedOrigins("http://localhost", "http://localhost:9090")
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}
}

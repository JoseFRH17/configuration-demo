package com.leanmind.propertiesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PropertiesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertiesDemoApplication.class, args);
    }

}

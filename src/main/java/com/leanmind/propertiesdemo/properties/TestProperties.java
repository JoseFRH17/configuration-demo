package com.leanmind.propertiesdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test")
public record TestProperties(
        String myProperty,
        List<String> aListOfProperties,
        Map<String, String> aMapOfProperties,
        @NestedConfigurationProperty
        NestedProperties nestedProperties
) {}

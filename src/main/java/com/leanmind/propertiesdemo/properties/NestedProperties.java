package com.leanmind.propertiesdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test.nested-properties")
public record NestedProperties(
        String property,
        List<String> nestedList,
        Map<String, String> nestedMap
) {}

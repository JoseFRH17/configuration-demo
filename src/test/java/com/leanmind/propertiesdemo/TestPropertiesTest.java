package com.leanmind.propertiesdemo;

import com.leanmind.propertiesdemo.properties.TestProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class TestPropertiesTest {

    @Autowired
    private TestProperties testProperties;

    @Test
    void should_load_properties_from_test_profile() {
        Assertions.assertEquals("aValue", testProperties.myProperty());
    }
}

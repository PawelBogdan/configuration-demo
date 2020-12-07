package com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigurationDemoApplicationTests {

    @Autowired
    private FooProperties properties;

    @Test
    void contextLoads() {
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println(properties);
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------");
    }

}

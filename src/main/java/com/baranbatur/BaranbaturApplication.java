package com.baranbatur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class BaranbaturApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaranbaturApplication.class, args);
    }
}

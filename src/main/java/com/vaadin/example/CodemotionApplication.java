package com.vaadin.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class CodemotionApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(CodemotionApplication.class, args);
    }
}

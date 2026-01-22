package com.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day2HelloWorldApplication {

    public static final Logger logger =
            LoggerFactory.getLogger(Day2HelloWorldApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Day2HelloWorldApplication.class, args);

        logger.info("Welcome to Spring Boot Hello World Application");
        logger.info("Application Context: " + context);
    }
}

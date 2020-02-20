package com.test.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApp {
    public static void main(String[] args) {
    	Logger logger = LoggerFactory.getLogger(SpringBootTestApp.class); 
        SpringApplication.run(SpringBootTestApp.class, args);
        logger.info("SpringBootTestApp has started");
    }
}
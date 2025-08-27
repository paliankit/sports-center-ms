package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SportsCenterApplication {
    public static void main(String[] arguments){
        SpringApplication.run(SportsCenterApplication.class,arguments);
    }
}

package com.example.buns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BunsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BunsApplication.class, args);
    }
}

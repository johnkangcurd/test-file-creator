package com.cmc.testing.filetester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int i = 1/0;
        SpringApplication.run(Application.class, args);
    }
}

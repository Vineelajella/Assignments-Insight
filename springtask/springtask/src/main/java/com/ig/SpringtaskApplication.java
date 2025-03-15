package com.ig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.springtask", "com.ig"})
public class SpringtaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringtaskApplication.class, args);
    }
}

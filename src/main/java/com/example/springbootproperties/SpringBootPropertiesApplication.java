package com.example.springbootproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootPropertiesApplication {

    @Value("${spring.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPropertiesApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String name(){
        return name;
    }
}

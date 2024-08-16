package com.cloudapplicationspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudApplicationSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplicationSpringApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World! 🌎";
    }

}

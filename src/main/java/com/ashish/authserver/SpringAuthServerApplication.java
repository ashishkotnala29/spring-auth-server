package com.ashish.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthServerApplication.class, args);
    }

    @GetMapping("/")
    public String test() {
        return "You're in!";
    }
}

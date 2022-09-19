package com.laaserdemo.springappdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("springdemo")
public class SpringAppDemo1Application {

    @GetMapping(value = "/message", produces = {})
    public String message (){
        return "Das ist deine Spring Boot über Azure gehostet! Herzlichen Glückwunsch";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAppDemo1Application.class, args);
    }
}

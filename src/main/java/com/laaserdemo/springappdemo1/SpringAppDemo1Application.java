package com.laaserdemo.springappdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppDemo1Application {

    @GetMapping(value = "/message", produces = {})
    public String message (){
        return "Das ist meine erste Spring Boot Anwendung ausgeführt in Containern!";
    }

    public static void main(String[] args) {

        System.out.println("Hallo ich bin eine Jar!");
        SpringApplication.run(SpringAppDemo1Application.class, args);
    }
}

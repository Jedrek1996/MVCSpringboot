package com.jedrek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;


@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("Main initializing");
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/greet")
    public GreetRepsonse greet() {
        return new GreetRepsonse("Hello");
    }

    record GreetRepsonse(String greet){}
}

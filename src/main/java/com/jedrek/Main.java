package com.jedrek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;


@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("Main initializing");
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello", List.of("Golang","Java","JS"),new Person("Jed"));
    }

    record Person(String name){}

    record GreetResponse(String greet,
                         List<String> favProgrammingLanguages,
                         Person person){}
}

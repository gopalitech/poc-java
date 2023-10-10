package com.poc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

}

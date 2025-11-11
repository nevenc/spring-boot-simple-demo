package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
class Home {

    @GetMapping("/")
    String home() {
        return "Spring Boot Demo Application";
    }

}

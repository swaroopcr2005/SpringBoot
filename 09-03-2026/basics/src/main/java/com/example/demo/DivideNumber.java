package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideNumber {

    @PostMapping("/divide")
    public double divideNumbers(@RequestParam double a, @RequestParam double b) {
        return a / b;
    }
}
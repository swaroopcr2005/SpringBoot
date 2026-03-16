package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Subnumber {

    @GetMapping("/sub/{a}/{b}")
    public int subtractNumbers(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }
}
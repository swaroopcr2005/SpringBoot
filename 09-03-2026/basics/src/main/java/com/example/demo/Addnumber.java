package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Addnumber {

    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return (a + b);
    }
}
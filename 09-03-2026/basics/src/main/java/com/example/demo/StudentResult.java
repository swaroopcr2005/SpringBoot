package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResult {
    @PostMapping("/result")
    public String marks(@RequestBody  Studentmarks std) {
    int total=std.getM1() + std.getM2()+ std.getM3();
        return "sum :"+ total + "\navg :"+total/3;

    
    }
    
}
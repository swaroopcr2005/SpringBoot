package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiNumber {

    @PostMapping("/multiply")
    public int multiplyNumbers(@RequestBody Number num) {
        return num.getA() * num.getB();
    }
}
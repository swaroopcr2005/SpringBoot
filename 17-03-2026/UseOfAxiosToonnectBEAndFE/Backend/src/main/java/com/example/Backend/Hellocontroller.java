package com.example.Backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

     @CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("hello....", "swaroop ");
    }

    static class HelloResponse {
        public String msg, description;

        public HelloResponse(String msg, String description) {
            this.msg = msg;
            this.description = description;
        }

    }

}

    


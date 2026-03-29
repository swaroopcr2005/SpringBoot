package com.example.Authentication.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegiterRequest regiterRequest){
       String message=authService.register(regiterRequest.getUsername(),regiterRequest.getPassword() );

       return new AuthResponse(null,message);
    };
@PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest loginRequest){
        String token=authService.login(loginRequest.getUsername(),loginRequest.getPassword() );
        return new AuthResponse(token,"Login successfull");

    };
@GetMapping("/hello")
    public String Hello(){
        return "hello,you are Authenticated";

    };

    
}



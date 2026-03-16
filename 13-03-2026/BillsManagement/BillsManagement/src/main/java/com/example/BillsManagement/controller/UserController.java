package com.example.BillsManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsManagement.dto.request.UserRequest;
import com.example.BillsManagement.dto.response.ApiResponse;
import com.example.BillsManagement.dto.response.UserResponse;
import com.example.BillsManagement.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest req) {
        UserResponse userResponse = userService.createUser(req);
        return new ApiResponse<>("success", userResponse);
    }
}

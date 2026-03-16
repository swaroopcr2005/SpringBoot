package com.example.BillsManagement.service;

import org.springframework.stereotype.Service;

import com.example.BillsManagement.dto.request.UserRequest;
import com.example.BillsManagement.dto.response.UserResponse;
import com.example.BillsManagement.entity.UserInfo;
import com.example.BillsManagement.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest req) {
        UserInfo user = new UserInfo();
        user.setUserName(req.getUserName());
        UserInfo savedUser = userRepository.save(user);
        return new UserResponse(savedUser.getUserId(), savedUser.getUserName());
    }
}

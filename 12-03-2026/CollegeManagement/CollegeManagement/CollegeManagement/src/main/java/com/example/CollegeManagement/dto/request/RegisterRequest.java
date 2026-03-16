package com.example.CollegeManagement.dto.request;

public class RegisterRequest {
     private String registerNo;

    public RegisterRequest(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }
}

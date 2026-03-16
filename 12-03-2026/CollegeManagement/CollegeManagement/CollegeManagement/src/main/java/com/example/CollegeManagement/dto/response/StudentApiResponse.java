package com.example.CollegeManagement.dto.response;

public class StudentApiResponse <T> {
    private String status;
    private T data;
    public StudentApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    
    
}

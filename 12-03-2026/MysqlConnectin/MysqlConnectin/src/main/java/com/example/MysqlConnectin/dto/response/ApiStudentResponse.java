package com.example.MysqlConnectin.dto.response;

public class ApiStudentResponse<T> {
    private String status;
    private T data;
    public ApiStudentResponse(String status,T data){
        this.status=status;
        this.data=data;
        
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

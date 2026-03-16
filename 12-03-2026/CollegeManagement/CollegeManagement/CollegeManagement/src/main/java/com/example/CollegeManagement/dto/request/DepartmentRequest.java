package com.example.CollegeManagement.dto.request;

public class DepartmentRequest {
     private String department;

    public DepartmentRequest(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

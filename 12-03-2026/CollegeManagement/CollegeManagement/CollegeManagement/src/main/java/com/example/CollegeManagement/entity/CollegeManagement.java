package com.example.CollegeManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
public class CollegeManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(name = "RegisterNo")
    private String studentRegisterNo;

    @Column(name = "department")
    private String department;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getStudentRegisterNo() {
        return studentRegisterNo;
    }

    public void setStudentRegisterNo(String studentRegisterNo) {
        this.studentRegisterNo = studentRegisterNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
}

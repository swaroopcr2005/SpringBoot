package com.example.MysqlConnectin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")

public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "useId")
    private Long studentId;
    @Column(name = "StudentName")
    private String studentname;

    @OneToOne
    @JoinColumn(name = "register_id")
    private RegisterNumber registerNumber;
    

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public RegisterNumber getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(RegisterNumber registerNumber) {
        this.registerNumber = registerNumber;
    }

}

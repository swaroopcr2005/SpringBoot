package com.example.CollegeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String studentName;

    @OneToOne
    @JoinColumn(name = "RegisterNo")
    private CollegeManagement studentRegisterNo;

    private String studentCourse;

    @OneToOne
    @JoinColumn(name = "teacherId")
    private TeacherEntity teacherId;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public CollegeManagement getStudentRegisterNo() {
        return studentRegisterNo;
    }

    public void setStudentRegisterNo(CollegeManagement studentRegisterNo) {
        this.studentRegisterNo = studentRegisterNo;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public TeacherEntity getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(TeacherEntity teacherId) {
        this.teacherId = teacherId;
    }

}

package com.example.CollegeManagement.dto.request;

public class StudentRequest {

    private String studentName;
    private String studentCourse;

    public StudentRequest(String studentName, String studentCourse) {
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

}

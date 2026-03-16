package com.example.CollegeManagement.dto.response;

public class StudentResponse {
    private Long studentId;
    private String studentName;
    private String studentRegisterNo;
    private String studentCourse;
    private long teacherId;

    public StudentResponse(Long studentId, String studentName, String studentRegisterNo, String studentCourse,
            long teacherId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRegisterNo = studentRegisterNo;
        this.studentCourse = studentCourse;
        this.teacherId = teacherId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRegisterNo() {
        return studentRegisterNo;
    }

    public void setStudentRegisterNo(String studentRegisterNo) {
        this.studentRegisterNo = studentRegisterNo;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

}

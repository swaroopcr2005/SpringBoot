package com.example.CollegeManagement.dto.response;

public class TeacherResponse {
    private long teacherId;
    private String teacherName;
    private long PhoneNo;
    private String email;
    private String department;

    public TeacherResponse(long teacherId, String teacherName, long phoneNo, String email, String department) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        PhoneNo = phoneNo;
        this.email = email;
        this.department = department;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

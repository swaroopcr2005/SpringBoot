package com.example.MysqlConnectin.dto.response;

public class Studentresponse {
    private Long studentid;
    private String studentname;
    private String registernumber;
    public Studentresponse(Long studentid, String studentname, String registernumber) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.registernumber = registernumber;
    }
    public Long getStudentid() {
        return studentid;
    }
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getRegisternumber() {
        return registernumber;
    }
    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }
            

}


package com.example.Student.dto.response;

public class StudentResponse {
    private String name,result;
    private int rollNo,tot;
    private double percentage;
    public StudentResponse(String name, int rollNo, int tot, double percentage,String result) {
        this.name = name;
        this.rollNo = rollNo;
        this.tot = tot;
        this.percentage = percentage;
        this.result=result;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getTot() {
        return tot;
    }
    public void setTot(int tot) {
        this.tot = tot;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    
    
}

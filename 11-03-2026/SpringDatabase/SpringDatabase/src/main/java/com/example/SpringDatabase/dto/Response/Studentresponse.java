package com.example.SpringDatabase.dto.Response;

public class Studentresponse {
    private String name;
    private int rollNumber;
    private int total;
    private double percentage;
    private String result;
    public Studentresponse(String name, int rollNumber, int total, double percentage, String result) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.total = total;
        this.percentage = percentage;
        this.result = result;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
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

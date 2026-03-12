package com.example.grocery.dto.response;

public class Groceryresponse {
    private String customername;
    private int total;
    private double gst;
    private double netTotal;

    public Groceryresponse(String customername, int total, double gst, double netTotal) {
        this.customername = customername;
        this.total = total;
         this.gst = gst;
        this.netTotal = netTotal;
       
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

}

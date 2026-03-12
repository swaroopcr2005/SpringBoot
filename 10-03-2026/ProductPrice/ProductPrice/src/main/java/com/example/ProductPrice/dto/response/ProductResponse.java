package com.example.ProductPrice.dto.response;

public class ProductResponse {
    private String customername;
    private int id,total;
    private double NetTot,gst;
    public ProductResponse(String customername, int id, int total, double percentage, double gst) {
        this.customername = customername;
        this.id = id;
        this.total = total;
        this.NetTot = percentage;
        this.gst = gst;
    }
    public String getCustomername() {
        return customername;
    }
    public void setCustomername(String customername) {
        this.customername = customername;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getNetTot() {
        return NetTot;
    }
    public void setNetTot(double percentage) {
        this.NetTot = percentage;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
     
    
}

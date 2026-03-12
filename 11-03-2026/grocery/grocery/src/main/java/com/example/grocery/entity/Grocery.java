package com.example.grocery.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grocery{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String customername;
    private double gst,netTotal;
    private int total;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCustomername() {
        return customername;
    }
    public void setCustomername(String customername) {
        this.customername = customername;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total =  total;
    }
    public double getNetTotal() {
        return netTotal;
    }
    public void setNetTotal(double netTotal) {
        this.netTotal =  netTotal;
    }
 

    

}


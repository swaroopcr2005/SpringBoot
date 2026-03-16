package com.example.MysqlConnectin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Registration")

public class RegisterNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long ID;

    @Column(name = "registrationNumber")
   private String regNumber;

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    
}

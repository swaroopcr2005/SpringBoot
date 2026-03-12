package com.example.ProductPrice.dto.response;

public class ApiProduct {
    private String status;
    private ProductResponse data;
    public ApiProduct(String status, ProductResponse data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public ProductResponse getData() {
        return data;
    }
    public void setData(ProductResponse data) {
        this.data = data;
    }
    
    
}

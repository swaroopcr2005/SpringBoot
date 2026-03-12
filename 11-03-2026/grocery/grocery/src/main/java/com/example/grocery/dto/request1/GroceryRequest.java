package com.example.grocery.dto.request1;

import java.util.List;

public class GroceryRequest {
     private String customername;
    private List<Integer> product;
    public String getCustomername() {
        return customername;
    }
    public void setCustomername(String customername) {
        this.customername = customername;
    }
    public List<Integer> getProduct() {
        return product;
    }
    public void setProduct(List<Integer> product) {
        this.product = product;
    }

    
}

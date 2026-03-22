package com.example.demo.dto.request;

import lombok.Data;

@Data
public class ProductRequest {
    private String prodName;
    private Integer prodQty;
    private Double prodMrp;
    private Double prodTax;
}

package com.example.ProductPrice.service;

import org.springframework.stereotype.Service;

import com.example.ProductPrice.dto.request.ProductRequest;
import com.example.ProductPrice.dto.response.ProductResponse;

@Service

public class ProductService {
    public ProductResponse calProductResponse(ProductRequest req){
    int total=0;
    total=req.getP1()+req.getP2()+req.getP3()+req.getP4();
    double gst,NetTot;
    gst=(18.0/100.0)*total;
    NetTot=total+gst;
    return new ProductResponse(req.getCustomername(),req.getId(), total, NetTot, gst);
    }
    
    
}

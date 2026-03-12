package com.example.ProductPrice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProductPrice.dto.request.ProductRequest;
import com.example.ProductPrice.dto.response.ApiProduct;
import com.example.ProductPrice.dto.response.ProductResponse;
import com.example.ProductPrice.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
@PostMapping("/bill")
    public ApiProduct getResult(@RequestBody ProductRequest req){
        ProductResponse NetTot=productService.calProductResponse(req);
        return new ApiProduct("success", NetTot);
    }
}
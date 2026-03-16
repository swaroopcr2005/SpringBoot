package com.example.BillsManagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillsManagement.dto.request.BillRequest;
import com.example.BillsManagement.dto.request.ProductRequest;
import com.example.BillsManagement.dto.response.ApiResponse;
import com.example.BillsManagement.dto.response.BillResponse;
import com.example.BillsManagement.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/add")
    public ApiResponse<BillResponse> createBill(@RequestBody BillRequest req) {
        BillResponse billResponse = billService.createBill(req);
        return new ApiResponse<>("success", billResponse);
    }

    @PostMapping("/{billId}/product/add")
    public ApiResponse<BillResponse> addProduct(
            @PathVariable Long billId,
            @RequestBody ProductRequest req) {
        BillResponse billResponse = billService.addProductToBill(billId, req);
        return new ApiResponse<>("success", billResponse);
    }
}

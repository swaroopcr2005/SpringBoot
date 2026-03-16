package com.example.BillsManagement.dto.response;

import java.util.List;

public class BillResponse {
    private Long billId;
    private Long userId;
    private String userName;
    private List<ProductResponse> products;

    public BillResponse(Long billId, Long userId, String userName, List<ProductResponse> products) {
        this.billId = billId;
        this.userId = userId;
        this.userName = userName;
        this.products = products;
    }

    public Long getBillId() { return billId; }
    public void setBillId(Long billId) { this.billId = billId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public List<ProductResponse> getProducts() { return products; }
    public void setProducts(List<ProductResponse> products) { this.products = products; }
}

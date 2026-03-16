package com.example.BillsManagement.dto.response;

public class ProductResponse {
    private Long productId;
    private String productName;
    private Integer productQuantity;
    private Double productPrice;
    private Double productTax;
    private Double productTotal;

    public ProductResponse(Long productId, String productName, Integer productQuantity,
                           Double productPrice, Double productTax, Double productTotal) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productTax = productTax;
        this.productTotal = productTotal;
    }

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Integer getProductQuantity() { return productQuantity; }
    public void setProductQuantity(Integer productQuantity) { this.productQuantity = productQuantity; }

    public Double getProductPrice() { return productPrice; }
    public void setProductPrice(Double productPrice) { this.productPrice = productPrice; }

    public Double getProductTax() { return productTax; }
    public void setProductTax(Double productTax) { this.productTax = productTax; }

    public Double getProductTotal() { return productTotal; }
    public void setProductTotal(Double productTotal) { this.productTotal = productTotal; }
}

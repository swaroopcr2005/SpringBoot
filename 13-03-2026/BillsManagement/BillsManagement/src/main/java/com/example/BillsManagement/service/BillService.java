package com.example.BillsManagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.BillsManagement.dto.request.BillRequest;
import com.example.BillsManagement.dto.request.ProductRequest;
import com.example.BillsManagement.dto.response.BillResponse;
import com.example.BillsManagement.dto.response.ProductResponse;
import com.example.BillsManagement.entity.Bill;
import com.example.BillsManagement.entity.Product;
import com.example.BillsManagement.entity.UserInfo;
import com.example.BillsManagement.repository.BillRepository;
import com.example.BillsManagement.repository.ProductRepository;
import com.example.BillsManagement.repository.UserRepository;

@Service
public class BillService {

    private final BillRepository billRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public BillService(BillRepository billRepository,
                       UserRepository userRepository,
                       ProductRepository productRepository) {
        this.billRepository = billRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public BillResponse createBill(BillRequest req) {
        UserInfo user = userRepository.findById(req.getUserId())
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        Bill bill = new Bill();
        bill.setUser(user);
        Bill savedBill = billRepository.save(bill);

        return new BillResponse(savedBill.getBillId(), user.getUserId(), user.getUserName(), new ArrayList<>());
    }

    public BillResponse addProductToBill(Long billId, ProductRequest req) {
        Bill bill = billRepository.findById(billId)
                .orElseThrow(() -> new RuntimeException("Bill Not Found"));

        // Calculate total: (price * quantity) + tax
        double total = (req.getProductPrice() * req.getProductQuantity()) + req.getProductTax();

        Product product = new Product();
        product.setProductName(req.getProductName());
        product.setProductQuantity(req.getProductQuantity());
        product.setProductPrice(req.getProductPrice());
        product.setProductTax(req.getProductTax());
        product.setProductTotal(total);
        product.setBill(bill);

        productRepository.save(product);

        // Reload bill with all products
        Bill updatedBill = billRepository.findById(billId)
                .orElseThrow(() -> new RuntimeException("Bill Not Found"));

        List<ProductResponse> productResponses = updatedBill.getProducts().stream()
                .map(p -> new ProductResponse(
                        p.getProductId(),
                        p.getProductName(),
                        p.getProductQuantity(),
                        p.getProductPrice(),
                        p.getProductTax(),
                        p.getProductTotal()))
                .collect(Collectors.toList());

        UserInfo user = updatedBill.getUser();
        return new BillResponse(updatedBill.getBillId(), user.getUserId(), user.getUserName(), productResponses);
    }
}

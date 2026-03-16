package com.example.BillsManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillsManagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

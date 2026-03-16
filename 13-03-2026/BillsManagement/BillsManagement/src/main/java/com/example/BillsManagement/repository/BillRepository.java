package com.example.BillsManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillsManagement.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}

package com.example.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.entity.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery,Long>{

    
} 
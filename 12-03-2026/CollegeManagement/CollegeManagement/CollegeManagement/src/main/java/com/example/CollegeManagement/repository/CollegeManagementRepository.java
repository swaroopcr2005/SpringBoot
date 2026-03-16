package com.example.CollegeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeManagement.entity.CollegeManagement;

public interface CollegeManagementRepository extends JpaRepository<CollegeManagement, Long>{
    
}

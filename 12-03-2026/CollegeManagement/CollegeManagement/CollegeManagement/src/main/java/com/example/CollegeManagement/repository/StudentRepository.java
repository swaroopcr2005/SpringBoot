package com.example.CollegeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeManagement.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

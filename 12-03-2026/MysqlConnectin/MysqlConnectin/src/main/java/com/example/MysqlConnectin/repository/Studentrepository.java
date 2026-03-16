package com.example.MysqlConnectin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MysqlConnectin.entity.StudentInfo;

 
    public interface Studentrepository extends JpaRepository<StudentInfo,Long> {
    
        
    }
    


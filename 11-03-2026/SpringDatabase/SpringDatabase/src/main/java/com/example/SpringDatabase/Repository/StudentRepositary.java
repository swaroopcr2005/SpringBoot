package com.example.SpringDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDatabase.Entity.Student;

public interface StudentRepositary extends JpaRepository<Student,Long>{


    
} 


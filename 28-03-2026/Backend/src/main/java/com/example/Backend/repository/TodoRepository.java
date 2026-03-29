package com.example.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity,Long>{

    
    
}

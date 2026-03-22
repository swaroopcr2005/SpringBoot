package com.example.Calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Calculation.entity.AdditionEntity;

public interface AdditionRepository extends JpaRepository<AdditionEntity, Long> {

}

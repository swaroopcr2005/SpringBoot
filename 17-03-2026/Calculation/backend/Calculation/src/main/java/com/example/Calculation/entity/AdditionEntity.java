package com.example.Calculation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addition")
public class AdditionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long additionId;
    private double firstNummber, secondNumber,AdditionResult;

}

package com.example.Calculation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionResponse {
    private long additionId;
    private double firstNumber,secondNumber;
    private double additionResult;
}

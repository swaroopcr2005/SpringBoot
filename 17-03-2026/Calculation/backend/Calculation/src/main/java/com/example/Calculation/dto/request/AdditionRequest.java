package com.example.Calculation.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AdditionRequest {

    @NotBlank(message = "Enter the 1st number")
    private double firstNumber;
    @NotBlank(message = "Enter a 2nd number")
    private double secondnumber;
}

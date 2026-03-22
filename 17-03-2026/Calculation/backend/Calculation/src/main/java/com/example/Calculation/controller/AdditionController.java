package com.example.Calculation.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Calculation.api.AdditionApi;
import com.example.Calculation.dto.request.AdditionRequest;
import com.example.Calculation.dto.response.AdditionResponse;
import com.example.Calculation.service.AdditionService;

import jakarta.validation.Valid;

@RestController
  @CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/add")
public class AdditionController {

    private final AdditionService additionService;

    public AdditionController(AdditionService additionService) {
        this.additionService = additionService;
    }

    @PostMapping("/result")
    public AdditionApi<AdditionResponse> getAllResult(@Valid @RequestBody AdditionRequest request) {
        AdditionResponse finalAdditionResponse = additionService.getRresult(request);

        return new AdditionApi<AdditionResponse>("success", finalAdditionResponse);
    }
}

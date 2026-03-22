package com.example.Calculation.service;

import org.springframework.stereotype.Service;

import com.example.Calculation.dto.request.AdditionRequest;
import com.example.Calculation.dto.response.AdditionResponse;
import com.example.Calculation.entity.AdditionEntity;
import com.example.Calculation.repository.AdditionRepository;

@Service
public class AdditionService {
    private final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }

    public AdditionResponse getRresult(AdditionRequest req) {

        AdditionEntity additionEntity = new AdditionEntity();

        double additionResult = req.getFirstNumber() + req.getSecondnumber();

        additionEntity.setFirstNummber(req.getFirstNumber());
        additionEntity.setSecondNumber(req.getSecondnumber());
        additionEntity.setAdditionResult(additionResult);

        AdditionEntity saveAdditionEntity = additionRepository.save(additionEntity);

        return new AdditionResponse(saveAdditionEntity.getAdditionId(), saveAdditionEntity.getFirstNummber(),
                saveAdditionEntity.getSecondNumber(), saveAdditionEntity.getAdditionResult());

    }
}

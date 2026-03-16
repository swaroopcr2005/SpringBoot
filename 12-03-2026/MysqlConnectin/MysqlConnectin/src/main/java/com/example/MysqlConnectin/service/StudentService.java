package com.example.MysqlConnectin.service;

import org.springframework.stereotype.Service;

import com.example.MysqlConnectin.dto.request.Studentrequest;
import com.example.MysqlConnectin.dto.response.Studentresponse;
import com.example.MysqlConnectin.entity.RegisterNumber;
import com.example.MysqlConnectin.entity.StudentInfo;
import com.example.MysqlConnectin.repository.RegisterNumberrepository;
import com.example.MysqlConnectin.repository.Studentrepository;

@Service
public class StudentService {
    private final Studentrepository studentrepository;
    private final RegisterNumberrepository registerNumberrepository;

    public StudentService(Studentrepository studentrepository, RegisterNumberrepository registerNumberrepository) {
        this.studentrepository = studentrepository;
        this.registerNumberrepository = registerNumberrepository;
    }

    public Studentresponse getStudentresponse(Studentrequest req) {
        StudentInfo std = new StudentInfo();
        std.setStudentname(req.getName());
        StudentInfo savedStudent = studentrepository.save(std);
        return new Studentresponse(
                savedStudent.getStudentId(),
                savedStudent.getStudentname(),
                null);
    }

    public Studentresponse assignRegistration(Long StudendId, String regNumber) {
        StudentInfo student = studentrepository.findById(StudendId)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        RegisterNumber register = new RegisterNumber();
        register.setRegNumber(regNumber);
        RegisterNumber savedRegister=registerNumberrepository.save(register);
        student.setRegisterNumber(savedRegister);

        studentrepository.save(student);

        return new Studentresponse(student.getStudentId(), student.getStudentname(),
                student.getRegisterNumber().getRegNumber());

    }

}

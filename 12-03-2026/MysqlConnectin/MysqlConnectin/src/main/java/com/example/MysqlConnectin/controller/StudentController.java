package com.example.MysqlConnectin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MysqlConnectin.dto.request.RegisterRequest;
import com.example.MysqlConnectin.dto.request.Studentrequest;
import com.example.MysqlConnectin.dto.response.ApiStudentResponse;
import com.example.MysqlConnectin.dto.response.Studentresponse;
import com.example.MysqlConnectin.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
private final StudentService studentService;
public StudentController(StudentService studentService){
    this.studentService = studentService;

}
@PostMapping("/add")
public ApiStudentResponse<Studentresponse> createStudent(@RequestBody Studentrequest req){
    Studentresponse studentresponse=studentService.getStudentresponse(req);
    return new ApiStudentResponse<Studentresponse>("success", studentresponse);

}
@PostMapping("/{id}/register")
public ApiStudentResponse<Studentresponse> assignRegister(
    @PathVariable Long id,
    @RequestBody RegisterRequest registerNumber
)
{
    Studentresponse response= studentService.assignRegistration(id, registerNumber.getRegisterationNumber());
    return new ApiStudentResponse<Studentresponse>("success", response);
}
}

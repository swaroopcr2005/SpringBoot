package com.example.CollegeManagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeManagement.dto.request.RegisterRequest;
import com.example.CollegeManagement.dto.request.StudentRequest;
import com.example.CollegeManagement.dto.response.StudentApiResponse;
import com.example.CollegeManagement.dto.response.StudentResponse;
import com.example.CollegeManagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

   @PostMapping("/result")
    public StudentApiResponse<StudentResponse> getResult(@RequestBody StudentRequest request) {
        StudentResponse response = studentService.getStudentResponses(request);
        return new StudentApiResponse<StudentResponse>("success", response);
    }

    @PostMapping("/{id}/teacher")
    public StudentApiResponse<StudentResponse> getResults(@PathVariable long id, @RequestBody RegisterRequest requests){
            StudentResponse responses = studentService.getCollegeData(id,requests.getRegisterNo());
            return new StudentApiResponse<StudentResponse>("success", responses);
    }
}


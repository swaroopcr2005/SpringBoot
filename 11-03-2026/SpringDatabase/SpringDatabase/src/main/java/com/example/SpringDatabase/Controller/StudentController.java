package com.example.SpringDatabase.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDatabase.dto.Request.Studentrequest;
import com.example.SpringDatabase.dto.Response.ApiResponse;
import com.example.SpringDatabase.dto.Response.Studentresponse;
import com.example.SpringDatabase.service.StudentService;

@RestController
@RequestMapping("/Student")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/result")
    public ApiResponse<Studentresponse> calResult(@RequestBody Studentrequest req){
        Studentresponse result=studentService.calcStudentresponse(req);
         return new ApiResponse<Studentresponse>("success", result);
    }
    @GetMapping("/all")
    public ApiResponse<List<Studentresponse>>GetMultipleStudent(){
                List<Studentresponse>result=studentService.GetMultipleStudent();

        return new ApiResponse<List<Studentresponse>>("success", result);


        
    }



}

package com.example.Student.service;

import org.springframework.stereotype.Service;

import com.example.Student.dto.request.StudentRequest;
import com.example.Student.dto.response.StudentResponse;

@Service

public class StudentService {
   
        public StudentResponse calStudentResponse(StudentRequest req){
            int total=0;
            total=req.getM1()+req.getM2()+req.getM3();
            double percentage=total/3.0;
            String result=percentage>=75 ?"pass":"fail";
            return new StudentResponse(req.getName(),req.getRollNo(), total, percentage,result);



        }
    
        
    }
  

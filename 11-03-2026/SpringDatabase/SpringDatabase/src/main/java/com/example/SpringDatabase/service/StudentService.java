package com.example.SpringDatabase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringDatabase.Entity.Student;
import com.example.SpringDatabase.Repository.StudentRepositary;
import com.example.SpringDatabase.dto.Request.Studentrequest;
import com.example.SpringDatabase.dto.Response.Studentresponse;

@Service
public class StudentService {
    private final StudentRepositary studentRepositary;

    public StudentService(StudentRepositary studentRepositary) {
        this.studentRepositary = studentRepositary;
    }

    public Studentresponse calcStudentresponse(Studentrequest request) {
        int total = request.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subject = request.getMarks().size();
        double percentage = (double) total / subject;
        String result = percentage >= 75 ? "pass" : "fail";
        Student student = new Student();

        student.setName(request.getName());
        student.setRollNumber(request.getRollNumber());
        student.setTotal(total);
        student.setPercentage(percentage);
        student.setResult(result);

        studentRepositary.save(student);

        return new Studentresponse(request.getName(), request.getRollNumber(), total, percentage, result);

    }

    public List<Studentresponse>GetMultipleStudent(){
        return studentRepositary.findAll()
        .stream()
        .map(student -> new Studentresponse(
            student.getName(),
            student.getRollNumber(),
            student.getTotal(),
            student.getPercentage() ,
            student.getResult())
        ).toList();
    }

}

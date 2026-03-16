package com.example.CollegeManagement.service;

import org.springframework.stereotype.Service;

import com.example.CollegeManagement.dto.request.StudentRequest;
import com.example.CollegeManagement.dto.response.StudentResponse;
import com.example.CollegeManagement.entity.CollegeManagement;
import com.example.CollegeManagement.entity.StudentEntity;
import com.example.CollegeManagement.repository.CollegeManagementRepository;
import com.example.CollegeManagement.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final CollegeManagementRepository collegeManagementRepository;

   

    public StudentService(StudentRepository studentRepository,
            CollegeManagementRepository collegeManagementRepository) {
        this.studentRepository = studentRepository;
        this.collegeManagementRepository = collegeManagementRepository;
    }

    public StudentResponse getStudentResponses(StudentRequest request) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentName(request.getStudentName());
        studentEntity.setStudentCourse(request.getStudentCourse());
        StudentEntity allInfo = studentRepository.save(studentEntity);
        // return new StudentResponse(allInfo.getStudentId(),
        // allInfo.getStudentName(),allInfo.getStudentCourse());
        return new StudentResponse(allInfo.getStudentId(), allInfo.getStudentName(),
                null, allInfo.getStudentCourse(), 0);
    }

    public StudentResponse getCollegeData(long studentId, String studentRegisterNo) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));


        CollegeManagement management = new CollegeManagement();
        management.setStudentRegisterNo(studentRegisterNo);

        CollegeManagement saveData = collegeManagementRepository.save(management);
        student.setStudentRegisterNo(saveData);

        studentRepository.save(student);
        return new StudentResponse(student.getStudentId(), student.getStudentName(),student.getStudentRegisterNo().getStudentRegisterNo(), 
                    student.getStudentCourse(),0); 
    }
}

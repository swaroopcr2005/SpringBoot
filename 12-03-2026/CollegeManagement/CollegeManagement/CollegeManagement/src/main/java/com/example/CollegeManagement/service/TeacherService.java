package com.example.CollegeManagement.service;

import org.springframework.stereotype.Service;

import com.example.CollegeManagement.dto.request.TeacherRequest;
import com.example.CollegeManagement.dto.response.TeacherResponse;
import com.example.CollegeManagement.entity.CollegeManagement;
import com.example.CollegeManagement.entity.TeacherEntity;
import com.example.CollegeManagement.repository.CollegeManagementRepository;
import com.example.CollegeManagement.repository.TeacherRepository;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final CollegeManagementRepository collegeManagementRepository;

    public TeacherService(TeacherRepository teacherRepository,
            CollegeManagementRepository collegeManagementRepository) {
        this.teacherRepository = teacherRepository;
        this.collegeManagementRepository = collegeManagementRepository;
    }

    public TeacherResponse getTeacherResponses(TeacherRequest request) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setTeacherName(request.getTeacherName());
        teacherEntity.setPhoneNo(request.getPhoneNo());
        teacherEntity.setEmail(request.getEmail());

        TeacherEntity save = teacherRepository.save(teacherEntity);

        return new TeacherResponse(save.getTeacherId(), save.getTeacherName(),
                save.getPhoneNo(), save.getEmail(), null);

    }

    public TeacherResponse getCollegeData(long teacherId, String department) {
        TeacherEntity teacherEntity = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher Not Found"));

        CollegeManagement collegeManagement = new CollegeManagement();
        collegeManagement.setDepartment(department);

        CollegeManagement save = collegeManagementRepository.save(collegeManagement);

        teacherEntity.setDepartment(save);
        teacherRepository.save(teacherEntity);

        return new TeacherResponse(teacherEntity.getTeacherId(), teacherEntity.getTeacherName(),
                teacherEntity.getPhoneNo(),
                teacherEntity.getEmail(), teacherEntity.getDepartment().getDepartment());

    }
}

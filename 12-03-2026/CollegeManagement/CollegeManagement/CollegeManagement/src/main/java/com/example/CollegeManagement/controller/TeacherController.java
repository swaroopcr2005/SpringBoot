package com.example.CollegeManagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeManagement.dto.request.DepartmentRequest;
import com.example.CollegeManagement.dto.request.TeacherRequest;
import com.example.CollegeManagement.dto.response.TeacherApiResponse;
import com.example.CollegeManagement.dto.response.TeacherResponse;
import com.example.CollegeManagement.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
     private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/result")
    public TeacherApiResponse<TeacherResponse> addTeacher(@RequestBody TeacherRequest request) {
        TeacherResponse response = teacherService.getTeacherResponses(request);
        return new TeacherApiResponse<>("success", response);
    }

    @PostMapping("/{id}/department")
    public TeacherApiResponse<TeacherResponse> assignDepartment(@PathVariable long id,
            @RequestBody DepartmentRequest request) {
        TeacherResponse response = teacherService.getCollegeData(id, request.getDepartment());
        return new TeacherApiResponse<>("success", response);
    }
}

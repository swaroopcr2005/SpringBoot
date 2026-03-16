package com.example.CollegeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeManagement.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {

}

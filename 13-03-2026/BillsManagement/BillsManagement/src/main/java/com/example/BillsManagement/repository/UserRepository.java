package com.example.BillsManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillsManagement.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
}

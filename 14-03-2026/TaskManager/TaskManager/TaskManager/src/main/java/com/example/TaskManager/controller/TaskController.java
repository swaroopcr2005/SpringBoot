package com.example.TaskManager.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManager.dto.request.TaskRequest;
import com.example.TaskManager.dto.response.ApiResponse;
import com.example.TaskManager.dto.response.TaskResponse;
import com.example.TaskManager.entity.TaskEntity;
import com.example.TaskManager.service.TaskService;

import jakarta.validation.Valid;
import lombok.Data;

@RestController
@RequestMapping("/task")
@Data
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/results")
    public ApiResponse<List<TaskResponse>> getTasks(@Valid @RequestBody List<TaskRequest> req) {

        List<TaskResponse> response = taskService.getResult(req);

        return new ApiResponse<List<TaskResponse>>("success", response);
    }

    @GetMapping
    public ApiResponse<Page<TaskEntity>> getTasks(Pageable pageable) {

        Page<TaskEntity> response = taskService.getTasks(pageable);
        return new ApiResponse<Page<TaskEntity>>("success", response);
    }
}

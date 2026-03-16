package com.example.TaskManager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.TaskManager.dto.request.TaskRequest;
import com.example.TaskManager.dto.response.TaskResponse;
import com.example.TaskManager.entity.TaskEntity;
import com.example.TaskManager.repository.TaskRepository;

import lombok.Data;

@Data
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public List<TaskResponse> getResult(List<TaskRequest> request) {

        List<TaskEntity> taskEntity = request.stream().map(
                req -> {
                    TaskEntity task = new TaskEntity();
                    task.setTitle(req.getTitle());
                    task.setDescription(req.getDescription());
                    task.setPriority(req.getPriority());

                    return task;
                }

        ).collect(Collectors.toList());

        List<TaskEntity> saveTaskEntity = taskRepository.saveAll(taskEntity);

        return saveTaskEntity.stream().map(
                task -> {
                    TaskResponse taskResponse = new TaskResponse();
                    taskResponse.setId(task.getId());
                    taskResponse.setTitle(task.getTitle());
                    taskResponse.setDescription(task.getDescription());
                    taskResponse.setPriority(task.getPriority());
                    return taskResponse;
                }).collect(Collectors.toList());

    }

    public Page<TaskEntity> getTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }
}

package com.example.Backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.dto.request.TodoRequest;
import com.example.Backend.dto.response.ApiResponse;
import com.example.Backend.dto.response.TodoResponse;
import com.example.Backend.service.TodoService;

@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // GET ALL
    @GetMapping
    public ApiResponse<List<TodoResponse>> getAllTodos() {
        return new ApiResponse<>(
                true,
                "Todos fetched successfully",
                todoService.getAllTodos());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ApiResponse<TodoResponse> getTodoById(@PathVariable Long id) {
        return new ApiResponse<>(
                true,
                "Todo fetched successfully",
                todoService.getTodoById(id));
    }

    // CREATE
    @PostMapping
    public ApiResponse<TodoResponse> createTodo(@RequestBody TodoRequest request) {
        return new ApiResponse<>(
                true,
                "Todo created successfully",
                todoService.createTodo(request));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ApiResponse<TodoResponse> updateTodo(@PathVariable Long id,
            @RequestBody TodoRequest request) {
        return new ApiResponse<>(
                true,
                "Todo updated successfully",
                todoService.updateTodo(id, request));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);

        return new ApiResponse<>(
                true,
                "Todo deleted successfully",
                null);
    }
}
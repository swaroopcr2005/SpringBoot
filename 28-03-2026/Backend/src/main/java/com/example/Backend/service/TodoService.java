package com.example.Backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Backend.dto.request.TodoRequest;
import com.example.Backend.dto.response.TodoResponse;
import com.example.Backend.entity.TodoEntity;
import com.example.Backend.exceptions.ResourceNotFoundException;
import com.example.Backend.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // GET ALL
    public List<TodoResponse> getAllTodos() {
        return todoRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    // GET BY ID
    public TodoResponse getTodoById(Long id) {
        TodoEntity todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        return mapToResponse(todo);
    }

    // CREATE
    public TodoResponse createTodo(TodoRequest request) {
        TodoEntity todo = new TodoEntity();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());

        TodoEntity saved = todoRepository.save(todo);

        return mapToResponse(saved);
    }

    // UPDATE
    public TodoResponse updateTodo(Long id, TodoRequest request) {
        TodoEntity todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());

        TodoEntity updated = todoRepository.save(todo);

        return mapToResponse(updated);
    }

    // DELETE
    public void deleteTodo(Long id) {
        TodoEntity todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        todoRepository.delete(todo);
    }

    // MAPPER (Entity → Response DTO)
    private TodoResponse mapToResponse(TodoEntity todo) {
        return new TodoResponse(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription());
    }
}

package com.example.TaskManager.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank(message = "Title should be added")
    private String title;

    private String description;

    @Positive(message = "Must be  a Positive Number")
    private Integer priority;

}

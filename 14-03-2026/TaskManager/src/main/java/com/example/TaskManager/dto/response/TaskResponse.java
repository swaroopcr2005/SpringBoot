package com.example.TaskManager.dto.response;

import lombok.Data;

@Data
public class TaskResponse {

    private long id;
    private String title;
    private String description;
    private Integer priority;

}

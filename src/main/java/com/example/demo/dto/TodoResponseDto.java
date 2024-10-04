package com.example.demo.dto;

import com.example.demo.entity.Todo;
import lombok.Getter;

@Getter
public class TodoResponseDto{
    private Long id;
    private String title;
    private String contents;
    private String username;
    private String date;

    public TodoResponseDto(Todo todo) {
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.contents = todo.getContents();
        this.username = todo.getUsername();
        this.date = todo.getDate();
    }
}
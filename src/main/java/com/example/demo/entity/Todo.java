package com.example.demo.entity;

import com.example.demo.dto.TodoCreateRequestDto;
import com.example.demo.dto.TodoUpdateRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Todo {
    private Long id;
    private String username;
    private String title;
    private String contents;
    private Long password;
    private String date;

    public Todo(TodoCreateRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }

    public void update(TodoUpdateRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.username = requestDto.getUsername();
    }
}

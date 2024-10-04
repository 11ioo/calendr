package com.example.demo.dto;


import lombok.Getter;

@Getter

public class TodoUpdateRequestDto {
    private String title;
    private String contents;
    private String username;
}
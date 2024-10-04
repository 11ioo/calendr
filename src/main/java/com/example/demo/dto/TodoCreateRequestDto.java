package com.example.demo.dto;


import lombok.Getter;

@Getter
public class TodoCreateRequestDto {
    private String title;
    private String contents;
    private String username;
    private String date;
    private Long password;
}
package com.springboottest.www.springboottest.domain;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class TestEntity {
    private String name;
    private Integer age;
    private String content;
    private LocalDateTime date;

    @Builder
    public TestEntity(String name, Integer age, String content, LocalDateTime date) {
        this.name = name;
        this.age = age;
        this.content = content;
        this.date = date;
    }
}

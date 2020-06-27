package com.springboottest.www.springboottest.web;

import com.springboottest.www.springboottest.domain.TestEntity;

import java.time.LocalDateTime;

public class Test {


    @org.junit.jupiter.api.Test
    void test(){

        final String s1 = TestEntity.builder()
                .age(1)
                .name("1")
                .content("1")
                .build().toString();

        final String s2 = TestEntity.builder()
                .age(2)
                .name("2")
                .content("2")
                .date(LocalDateTime.now())
                .build().toString();

        System.out.println(s1);
        System.out.println(s2);

    }

}

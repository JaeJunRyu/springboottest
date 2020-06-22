package com.springboottest.www.springboottest.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(HelloController.class)   //웹 API 테스트시 사용된다.
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    void helloDto가_리턴된다() throws Exception {
        String name="hello";
        int amount = 1000;

        mockMvc.perform(
                get("/hello/dto")
                    .param("name",name)
                    .param("amount",String.valueOf(amount))
        ).andExpect(status().isOk())
                .andExpect(jsonPath("name").value("hello"))
                .andExpect(jsonPath("amount").value(amount));
    }




}
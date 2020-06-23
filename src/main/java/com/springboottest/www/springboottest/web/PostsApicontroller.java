package com.springboottest.www.springboottest.web;

import com.springboottest.www.springboottest.service.posts.PostsService;
import com.springboottest.www.springboottest.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApicontroller {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto){

        return postsService.save(postsSaveRequestDto);
    }


}

package com.springboottest.www.springboottest.domain.posts;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    private PostsRepository postsRepository;

    @Test
    void 게시글저장_불러오기(){

        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        Posts tempdata = Posts.builder()
                .title(title)
                .content(content)
                .author("jayjun")
                .build();

        postsRepository.save(tempdata);

        //when
        List<Posts> postsList = postsRepository.findAll();


        //then
        Posts posts = postsList.get(0);

        assertEquals(posts.getTitle(),title);
        assertEquals(posts.getContent(),content);

//        postsRepository.deleteAll();
    }

}
package com.springboottest.www.springboottest.web.dto;

import com.springboottest.www.springboottest.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private LocalDateTime datetime;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, LocalDateTime datetime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.datetime = datetime;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .createdDateTime(datetime)
                .build();
    }

}

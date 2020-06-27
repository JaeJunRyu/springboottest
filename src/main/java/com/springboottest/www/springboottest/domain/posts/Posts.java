package com.springboottest.www.springboottest.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@ToString
@Getter
@NoArgsConstructor
@Entity
@DynamicUpdate //변경한 필드만 대응
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDateTime;




    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Builder
    public Posts(String title, String content, String author, LocalDateTime createdDateTime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdDateTime = createdDateTime;
    }


    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update( String content) {
        this.content = content;
    }


}

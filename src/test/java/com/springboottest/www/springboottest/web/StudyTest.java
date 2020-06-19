package com.springboottest.www.springboottest.web;



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("테스트 이름 변경1111")
    void 테스트_이름_변경(){

    }

    @Test
    @DisplayName("aaaaaa")
    void create_new_study(){
        Study study = new Study();

        assertNotNull(study);
        System.out.println("create");
    }

    @Test
//    @Disabled
    void create_new_study_again(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll(){
        //가장 처음에 한번 실행 됨
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll(){
        //가장 마지막에 한번 실행 됨
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforEach(){
        //테스트 메소드 실행 전 마다 실행 됨
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach(){
        //테스트 메소드 실행 후 마다 실행 됨
        System.out.println("afterEach");
    }

}
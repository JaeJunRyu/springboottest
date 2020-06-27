package com.springboottest.www.springboottest.web;

import org.junit.jupiter.api.*;

public class junit5Test {

    @BeforeAll // JUnit 4의 @BeforeClass
    static void initAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach  // JUnit 4의 @Before
    void init() {
        System.out.println("BeforeEach");
    }

    @Test
    void someTest() {
        System.out.println("someTest");
    }

    @Test
    void anyTest() {
        System.out.println("anyTest");
    }

    @AfterEach // JUnit 4의 @After
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll // JUnit 4의 @AfterClass
    static void tearDownAll() {
        System.out.println("AfterAll");
    }


}

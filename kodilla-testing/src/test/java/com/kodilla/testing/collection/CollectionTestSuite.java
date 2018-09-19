package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> even = new ArrayList<>();
        System.out.println("The List is empty:" + even.isEmpty() +";");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> even = new ArrayList<>();

        System.out.println("The list is empty:" + even.isEmpty());
    }

}

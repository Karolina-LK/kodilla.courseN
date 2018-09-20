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

        ArrayList<Integer> allNumbers = new ArrayList<>();
        allNumbers.add(200);
        allNumbers.add(199);
        allNumbers.add(180);
        allNumbers.add(179);
        allNumbers.add(2);



        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(allNumbers);

        ArrayList<Integer> verifiedNumbers;
        verifiedNumbers = new ArrayList<>();
        verifiedNumbers.add(200);
        verifiedNumbers.add(180);
        verifiedNumbers.add(2);

       Assert.assertEquals(exterminator, verifiedNumbers);

    }

}

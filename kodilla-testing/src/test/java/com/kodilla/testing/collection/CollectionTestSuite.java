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

        ArrayList<Integer> emptyList = OddNumbersExterminator.exterminate(new ArrayList<>());

        Assert.assertTrue(emptyList.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {


        ArrayList<Integer> evenList = OddNumbersExterminator.exterminate(new ArrayList<Integer> (1, 2, 3, 4, 5, 6, 7, 8, 9));

        Assert.assertTrue(evenList.size() == 4);
        assertResultNumbers(evenList);
    }

        private void assertResultNumbers (ArrayList < Integer > evenList) {
            for (Integer i : evenList) {
                Assert.assertTrue(i % 2 == 0);
            }
    }



}

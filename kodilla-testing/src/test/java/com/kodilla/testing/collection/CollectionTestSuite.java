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

        ArrayList<Integer> newEven = new ArrayList<Integer>();
        newEven.add(1);
        newEven.add(2);
        newEven.add(3);
        newEven.add(4);
        newEven.add(5);
        newEven.add(6);
        newEven.add(7);
        newEven.add(8);

        ArrayList<Integer> evenList = OddNumbersExterminator.exterminate(newEven);

        Assert.assertEquals(4, evenList.size());
        assertResultNumbers(evenList);
    }

        private void assertResultNumbers (ArrayList < Integer > evenList) {
            for (Integer i : evenList) {
                Assert.assertEquals(0, i % 2);
            }

    }






}

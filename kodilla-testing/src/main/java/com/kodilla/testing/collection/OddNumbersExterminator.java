package com.kodilla.testing.collection;

import java.util.ArrayList;

/**
 *
 */
public class OddNumbersExterminator{

    public void exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                System.out.println("The following number cannot be joined to the scope");
            }
        }

        System.out.println("The chosen, even numbers are as follows:" + even);
    }

}

class Number {

    public static void main (String[] args) throws java.lang.Exception {

        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        allNumbers.add(200);
        allNumbers.add(199);
        allNumbers.add(180);
        allNumbers.add(179);
        allNumbers.add(2);



      //  ArrayList<Integer> getAllNumbers() {
      //      return allNumbers;
      //  }

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(allNumbers);


    }

}


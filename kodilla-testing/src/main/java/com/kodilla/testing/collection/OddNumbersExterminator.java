package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator<Arraylist> {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
       /* numbers.add(6);
        numbers.add(2);
        numbers.add(1); */

        ArrayList<Integer> even = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                System.out.println("The number cannot be joined to the scope");
            }
        }

        return even;
    }
}




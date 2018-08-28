package com.kodilla.testing;

import com.kodilla.testing.user.SecondTry;


public class TestingMain {
    public static void main(String[] args){
        SecondTry simpleCalculator = new SecondTry();

        int result = simpleCalculator.substractAFromB(10, 5);
        int result2 = simpleCalculator.addAToB(10,5);

        System.out.println("Substracting: " + result + "\n" + "Adding: " + result2);


        if (result == 5){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == 15){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }

}


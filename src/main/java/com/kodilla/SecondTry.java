package com.kodilla;

public class SecondTry {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }
}

class WorkOut
{
    public static void main(String[] args) {

        SecondTry simpleCalculator = new SecondTry();

        int result = simpleCalculator.substractAFromB(10, 5);
        int result2 = simpleCalculator.addAToB(10,5);

        System.out.println("Substracting: " + result + "\n" + "Adding: " + result2);
    }
}



package com.jrodmanu.smallestmultiple;

public class SmallestMultiple {

    public static void main(String[] args) {

        boolean foundMultiple = false;
        long currentNumber = 19;
        boolean divisible;

        while(!foundMultiple) {
            currentNumber++;
            divisible = true;
            for (int i = 2; i <= 20; i++) {
                if(currentNumber % i != 0) {
                    divisible = false;
                    break;
                }
            }
            if(divisible == true) {
                foundMultiple = true;
            }
        }

        System.out.println(currentNumber);
    }

}

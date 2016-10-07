package com.jrodmanu._10001stprime;

public class _10001stPrime {

    public static void main(String[] args) {

        int whichPrime = 10001;
        int currentPrime = 0;

        long currentNumber = 1;
        long sqrtNumber;

        boolean isPrime;

        while(currentPrime < whichPrime) {
            currentNumber++;
            isPrime = true;
            sqrtNumber = (long)Math.floor(Math.sqrt(currentNumber));
            for(int i = 2; i <= sqrtNumber; i++) {
                if(currentNumber % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                currentPrime++;
            }
        }

    }

}

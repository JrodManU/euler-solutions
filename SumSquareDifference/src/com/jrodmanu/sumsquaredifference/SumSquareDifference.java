package com.jrodmanu.sumsquaredifference;

public class SumSquareDifference {

    public static void main(String[] args) {

        long sumSquares = 0;
        long sum = 0;

        for(int i = 1; i <= 100; i++) {
            sumSquares += Math.pow(i, 2);
            sum += i;
        }

        System.out.println(Math.pow(sum, 2) - sumSquares);

    }

}

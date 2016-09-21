package com.jrodmanu.evenfibonaccinumbers;

/**
 * Created by 19829 on 9/21/2016.
 */
public class EvenFibonacciaNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int range = 4000000;
        int a = 1;
        int b = 2;
        int swap;
        while(b < range) {
            if(b % 2 == 0) {
                sum += b;
            }
            swap = b;
            b = a + b;
            a = swap;
        }
        System.out.println(sum);
    }
}

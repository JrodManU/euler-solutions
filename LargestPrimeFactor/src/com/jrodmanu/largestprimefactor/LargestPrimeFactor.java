package com.jrodmanu.largestprimefactor;

/**
 * Created by 19829 on 9/21/2016.
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println(largestPrime(number));
    }

    public static long largestPrime(long number) {
        long sqrtNumber = (long)Math.floor(Math.sqrt(number));
        for(long i = sqrtNumber; i >= 2; i--) {
            if(number % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return 0L;
    }

    public static boolean isPrime(long number) {
        long sqrtNumber = (long)Math.floor(Math.sqrt(number));
        for(long i = 2; i <= sqrtNumber; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package com.jrodmanu.multiplesOf3And5;

/**
 * Created by 19829 on 9/21/2016.
 */
public class MultiplesOf3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int range = 1000;
        for(int i = 3; i < range; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

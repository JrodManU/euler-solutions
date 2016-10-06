package com.jrodmanu.largestpalindromeproduct;

public class LargestPalindromeProduct {

    public static void main(String[] args) {

        long largestPalindrome = 0;
        long currentNumber;
        String stringForm;
        boolean isPalindrome;

        for(int i = 1; i <= 999; i++) {
            for(int j = i; j < 999; j++) {
                currentNumber = i * j;
                if(currentNumber > largestPalindrome) {
                    isPalindrome = true;
                    stringForm = String.valueOf(currentNumber);
                    for(int k = 0; k < (int)Math.ceil(stringForm.length() / 2); k++) {
                        if(!(stringForm.charAt(k) == stringForm.charAt(stringForm.length() - k - 1))) {
                            isPalindrome = false;
                        }
                    }
                    if(isPalindrome) {
                        largestPalindrome = currentNumber;
                    }
                }
            }
        }

        System.out.println(largestPalindrome);

    }

}

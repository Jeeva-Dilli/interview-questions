package com.dev.interview;

/**
 Input :  10 2
 Output : 25
 Explanation : (here n = 10 and k = 2)
 1 3 5 7 9 (they are all palindrome
 in base 10 and 2) so sum is :
 1 + 3 + 5 + 7 + 9 = 25

 Input :  100 2
 Output : 157
 Explanation : 1 + 3 + 5 + 7 + 9 + 33 + 99 = 157
 */

public class DoubleBasePlaindrome {
    // converts number to base k by changing
// it into string.
    static String integer_to_string(int n, int base)
    {
        String str="";
        while (n > 0) {
            int digit = n % base;
            n /= base;
            str+=(char)(digit+'0');
        }
        return str;
    }

    // function to check for palindrome
    static int isPalindrome(int i, int k)
    {
        int temp = i;

        // m stores reverse of a number
        int m = 0;
        while (temp > 0) {
            m = temp % 10 + m * 10;
            temp /= 10;
        }

        // if reverse is equal to number
        if (m == i) {

            // converting to base k
            String str = integer_to_string(m, k);
            StringBuilder sb = new StringBuilder(str);
            String str1=sb.reverse().toString();
            if (str.equals(str1)) {
                return i;
            }
        }
        return 0;
    }

    // function to find sum of palindromes
    static void sumPalindrome(int n, int k){

        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += isPalindrome(i, k);
        }
        System.out.println("Total sum is "+sum);
    }

    // driver function
    public static void main(String[] args)
    {
        int n = 100;
        int k = 2;

        sumPalindrome(n, k);
    }
}

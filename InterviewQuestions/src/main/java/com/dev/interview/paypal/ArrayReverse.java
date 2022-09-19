package com.dev.interview.paypal;

public class ArrayReverse {
    static void reverse2(int a[], int n)
    {
        int[] b = new int[n];
        int j = n-1;
        for (int i = 0; i < n; i++) {
            b[j] = a[i];
            j--;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    static void reverse1(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse1(arr, arr.length);
    }
}

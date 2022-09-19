package com.walmart.example;

public class EquiliIndex{

    static int equilibrium(int a[], int n)
    {
        if (n == 1)
            return (0);

        int[] front = new int[n];
        int[] back = new int[n];

        // Taking the prefixsum from front end array
        for (int i = 0; i < n; i++)
        {
            if (i != 0)
            {
                front[i] = front[i - 1] + a[i];
            }
            else
            {
                front[i] = a[i];
            }
        }

        // Taking the prefixsum from back end of array
        for (int i = n - 1; i >= 0; i--)
        {
            if (i <= n - 2)
            {
                back[i] = back[i + 1] + a[i];
            }
            else
            {
                back[i] = a[i];
            }
        }

        // Checking for equilibrium index by
        //compairing front and back sums
        for(int i = 0; i < n; i++)
        {
            if (front[i] == back[i])
            {
                return i;
            }
        }

        // If no equilibrium index found,then return -1
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {-1,3,4,1,1};
        int arr_size = arr.length;

        System.out.println("First Point of equilibrium " +
                "is at index " +
                equilibrium(arr, arr_size));
    }
}
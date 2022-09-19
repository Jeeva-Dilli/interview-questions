package com.ds.sorting;

public class BubbleSort {

    void bubbleSort(int arr[ ], int n){

        for( int i = 0;  i < n-1; i++){          //outer loop for iterating to n-1 elements
            for( int j = 0; j < n-i-1; j++){      //inner loop for checking each element
                if (arr[ j ] > arr[ j+1 ]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[])
    {
       for(int a : arr)
        System.out.print(a +" ");
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr,arr.length);
        printArray(arr);
    }
}


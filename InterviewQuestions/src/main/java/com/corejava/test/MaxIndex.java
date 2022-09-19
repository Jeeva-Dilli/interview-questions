package com.corejava.test;

public class MaxIndex {

    public static int findMaximumPositiveIndex(int[] arr) {
        int min=arr[0],max=arr[0],minIndex=0,maxIndex=0;
        int maximumIndex = 0;
        for(int i=0;i<arr.length;i++){
                min = arr[i];
                minIndex=i;
            for(int j=i;j<arr.length;j++)
                {
                if(arr[j] > min){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if(maximumIndex < ((maxIndex - minIndex) +1) )
                maximumIndex = (maxIndex - minIndex) + 1;
        }
        return maximumIndex;

    }

    public static void main(String[] args) {
        int a[]={2,1,7,5,8,1};
        int s= findMaximumPositiveIndex(a);
        System.out.println(s);
    }

}

package com.interview;

public class MaxsumSubARR {
    public static void main(String[] args) {

        int[] arr = {1};
        maxSubarrays(arr);
    }

    public static void maxSubarrays(int[] arr)
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length;i++)
        {
            int temp=arr[i];

            for(int j=i+1;j<arr.length;j++)
            {
                if(temp>max)
                {
                    max= temp;
                }

                temp=temp+arr[j];

            }
            if(temp>max)
            {
                max= temp;
            }

        }

        System.out.println(max);


    }
}

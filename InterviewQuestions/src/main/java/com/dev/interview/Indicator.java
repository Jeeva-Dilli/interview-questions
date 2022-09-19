package com.dev.interview;

import java.util.LinkedList;
import java.util.List;

public class Indicator {

    public static int calc(Integer[] arr) {

        int first = arr[0];
        int count = 1;
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<arr.length;i++)
        {
            if(first == 1)
            {
                list.add(1);
            }
            if(first == arr[i])
            {
                count++;
            }

            if(count == arr[i])
            {
                list.add(arr[i]);
                count=1;
            }
            first = arr[i];
        }

        list.forEach(System.out::println);

        return list.size();

    }

    public static void main(String[] args) {
        Integer[] arr = {1,2, 2, 3, 3, 3, 4,4,4,4,1};
        // print number of occurrences is equal to number
        System.out.println(calc(arr));
    }
}

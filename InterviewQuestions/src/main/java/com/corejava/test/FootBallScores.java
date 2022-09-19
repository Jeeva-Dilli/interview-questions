package com.corejava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootBallScores {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,4,2,4);
        List<Integer> l2 = Arrays.asList(3,5);

        List<Integer> ans = count(l1,l2);
        ans.forEach(System.out::println);
    }
    public static List<Integer> count (List<Integer> l1, List<Integer> l2)
    {
        List<Integer> count = new ArrayList<>();
        int c = 0;
        for(Integer i : l2)
        {
            for(Integer j : l1)
            {
                if(i>j)
                    c++;
            }
            count.add(c);
            c=0;
        }

        return count;
    }
}

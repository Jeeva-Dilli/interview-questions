package com.corejava.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<List<String>> a = Arrays.asList(Arrays.asList("10 ", "20 ", "30 "), Arrays.asList("40 ", "50 ", "60 "), Arrays.asList("70 ", "80 ", "90 "));

        Set s = new HashSet();
        s.add(10L);
        s.add(10);

        for(Object o: s)
            System.out.println(o);

       String test = " This is test";
       String[] tok = test.split("\\s");
        System.out.println(tok.length);
        int n =1;

        Integer i;
        i = 1;

        int b = i;




    }

    public static void combinationString(List<List<String>> a)
    {

    }
}

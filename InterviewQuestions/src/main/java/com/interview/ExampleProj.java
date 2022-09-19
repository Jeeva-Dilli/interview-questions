package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleProj {
    public static void main(String[] args) {
        double d1 = Double.NaN;
        double d2 = Double.NaN;

        double d = 1/2;
        System.out.println(d);
        System.out.println(d1 == d2);

        System.out.println(String.valueOf(d2).compareTo(String.valueOf(d1)));



        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //list.remove(2);
        Integer i = 2;

        list.remove(i);

        list.forEach(System.out::println);

        Map<Integer,Integer> map = new HashMap<>();

        ExampleProj e = null;
        e.print();
    }

    static void print()
    {
        System.out.println("print");
    }
}

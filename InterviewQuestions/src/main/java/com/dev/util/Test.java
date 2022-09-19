package com.dev.util;

import java.util.ArrayList;
import java.util.List;

interface Addable{
    int add(int a,int b);
}

public class Test {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1=(a,b)-> a+b;

        String s = "";

        if(s==null || s.isEmpty())
        {
            System.out.println("empty");
        }

        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addable ad2=(int a,int b)-> a+b;
        System.out.println(ad2.add(100,200));

        List<String> list= new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(System.out::println);

    }
}

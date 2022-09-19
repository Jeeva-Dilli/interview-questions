package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

}

public class MCQ {
    public static void main(String[] args) {
        MCQ obj = new MCQ();
        try{
            obj.divide(3, 0);
        }catch(RuntimeException re){
            System.out.println("Runtime Exception");
        }catch(Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally End");
        }


         Q1();
         Q2();
         Q3();
         Q4();
         Q5();
         Q6();
         Q7();

    }
    public static void Q5(){
        int sum = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(i -> i % 2 == 0).map(i -> i * 2).sum();
        System.out.println(sum);
    }
    public static void Q1()
    {
        String s1 = "Hello ";
        s1 += "World";
        String s2 = "Hello";
        s2 += " ";
        s2 += "World";
        String s3 = s1.intern();
        String s4 = s2.intern();
        boolean b1 = s3 == s4;
        boolean b2 = s3.equals(s4);
        System.out.println(b1);
        System.out.println(b2);
    }
    public static void Q2()
    {
        Integer number = 10;
        number++;
        assert number == null && number >= 0;
        System.out.println(number);
    }
    enum Animals {
        LION, DOG, COW;
    }

    public static void Q3()
    {
        Animals[] animals = Animals.values();
        System.out.println(animals[1]);
    }
    public static void Q4()
    {
        Map<Color, String> map = new HashMap<>();
        map.put(new Color("Red"), "Red");
        map.put(new Color("Blue"), "Blue");
        map.put(new Color("Green"), "Green");

        System.out.println(map.get(new Color("Blue")));

    }
    public static void Q6()
    {
        Comparator<Integer> numberComparator = (number1, number2) -> number2.compareTo(number1);
        Integer arr[] = { 1, 4, 3, 2 };
        Arrays.sort(arr, numberComparator);
        for (Integer number : arr) {
            System.out.print(number + " ");
        }
    }
    public void divide(int a, int b){
        try{
            int c = a/b;
        }finally{
            System.out.println("Finally");
        }
    }
    private static Object method() {
        try {
            int i = 10 / 0;
            return i;
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            return "finally";
        }

    }
    public static void Q7()
    {
        method();
    }


}


package com.dev.util;

import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        List<Integer> l= Arrays.asList(a);
        l.add(5);
        l.forEach(System.out::println);
    }
}

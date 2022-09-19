package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateArray {

    public static void main(String[] args) {
        int a[] = {7,6,3,2,7,3,1,9,1};

        //Arrays.stream(a).filter(l->Collections.frequency(a,l)).collect(Collectors.toList());

        // List<Integer> list = findDupl(a);

        // list.forEach(System.out::println);
    }

    public static <T> List<T> findDupl(T a[])
    {
        List<T> list = Arrays.asList(a);
        Set<Integer> set = new HashSet<>();
        //  return list.stream().filter(l-> !set.add(l)).collect(Collectors.toList());
        return null;
    }
}


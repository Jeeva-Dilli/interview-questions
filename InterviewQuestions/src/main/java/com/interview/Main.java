package com.interview;

import java.util.ArrayList;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    {count = 1;}

    int count = 3;

    public Main(int count) {

        super();

        this.count = count;

    }

    public void go() {

        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        System.out.println(arr[count++][++count]);
    }
    public static void main(String args[]) {
        ArrayList obj = new ArrayList();
        obj.add("A");
        obj.add("D");
        obj.ensureCapacity(3);
        obj.trimToSize();
        System.out.println(obj.size());
        new Main(2).go();

    }
}
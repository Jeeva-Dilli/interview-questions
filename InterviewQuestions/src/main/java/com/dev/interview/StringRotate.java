package com.dev.interview;

public class StringRotate {
    public static void main(String[] args) {
        System.out.println(rotate("abcd",2,1));

        // abcd
        //cdab - 2 shift on left
        // bcda - 1 shift on right

    }

    public static String rotate(String s,int left,int right)
    {
        String first = s.substring(left) + s.substring(0,left);
        System.out.println(first);
        System.out.println(first.substring(0,s.length()-right));
        System.out.println(first.substring(s.length()-right));
        String result = first.substring(s.length()-right) + first.substring(0,s.length()-right);

        System.out.println(result);

        return result;
    }
}

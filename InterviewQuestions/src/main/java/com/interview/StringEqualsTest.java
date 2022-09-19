package com.interview;

public class StringEqualsTest {

    public static void main(String[] args) {

        String str1 = new String("java");
        String str2 = new String("java");
        if(str1 == str2){
            System.out.println("if block");
        }else{
            System.out.println("else block");
        }
    }


}

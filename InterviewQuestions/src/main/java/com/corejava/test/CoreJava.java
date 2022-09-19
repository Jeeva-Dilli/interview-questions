package com.corejava.test;


class CoreJavaTest{
    int in = 5;

    void change(int in)
    {
        in += 5;
    }
}
public class CoreJava {

    public static void main(String[] args) {

        CoreJavaTest test = new CoreJavaTest();
        test.change(5);
        System.out.println(test.in);

    }

    public static void change(Integer i)
    {
        i =10;
    }
}

package com.dev.interview;

class A
{
    static void staticMethod()
    {
        System.out.println("static method A");
    }
    void normalMethod()
    {
        System.out.println("Normal method A");
    }
}
class B extends A{

    static void staticMethod()
    {
        System.out.println("static method B");
    }
    void normalMethod()
    {
        System.out.println("Normal method B");
    }
}
public class StaticOverride {
    public static void main(String[] args) {
        A b = new B();
        b.normalMethod();
        b.staticMethod();
    }
}

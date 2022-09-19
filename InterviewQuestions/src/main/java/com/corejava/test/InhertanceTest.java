package com.corejava.test;

class B{
    int a;
   void add()
   {

   }

    @Override
    public boolean equals(Object o) {
       B b = (B) o;
        return this.a==b.a;
    }
}
public class InhertanceTest{
    public static void main(String[] args) {
    B b = new B();
    b.a=10;
    B b1 = new B();
    b1.a = 10;

        System.out.println(b==b1);
        System.out.println(b.equals(b1));

    }
}
package com.ds.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.pop();

        System.out.println("Size is : "+s.size());
        System.out.println("Peek element is : " +s.peek());
        s.show();


        DStack ds = new DStack();
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.push(6);
        ds.show();
        ds.pop();
        ds.show();
        ds.pop();
        ds.pop();
        ds.show();
    }
}

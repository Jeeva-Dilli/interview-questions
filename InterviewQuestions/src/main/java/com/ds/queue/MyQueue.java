package com.ds.queue;

import java.util.Stack;

class Queue {
    Stack<Integer> stack1 ,stack2 ;
    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void push(int x) {
        if(stack1.isEmpty())
            stack1.push(x);
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public void display()
    {
        for(int a : stack2)
        {
            System.out.print(a+" ");
            System.out.println();
        }
    }
}
public class MyQueue{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(13);
        queue.push(14);
        queue.push(15);
        queue.display();

    }

}

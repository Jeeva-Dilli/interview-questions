package com.ds.stack;

public class DStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top=0;

    public void push(int data)
    {
        if(size() == capacity)
            expand();

            stack[top] = data;
            top++;

    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity = capacity*2;
    }

    public int pop()
    {
            top--;
            int data = stack[top];
            stack[top] = 0;
            shrink();
            return data;
    }

    private void shrink() {
        if(size()<=(capacity/2))
            capacity=capacity/2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,size());
        stack = newStack;
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top>=0;
    }

    public int peek()
    {
        return stack[top-1];
    }

    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}

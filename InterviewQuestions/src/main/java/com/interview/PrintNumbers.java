package com.interview;

public class PrintNumbers {

    final int NUM = 100;
    static int i = 1;

    public void printOdd() {
        try {
            while (i % NUM == 1) {
                System.out.println(i); // throw new ArithmaticExceotion("test");
                i+=1;
                while (i % NUM == 0) {
                    wait();
                    notify();
                }

            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void printEven() {
        try {
            while (i % NUM == 1) {
                wait();

                while (i % NUM == 0) {
                    System.out.println(i);
                    i+=1;
                    notify();
                }

            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

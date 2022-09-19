package com.interview;

public class PrintNumberMain {
    public static void main(String[] args) {

        PrintNumbers numbers = new PrintNumbers();

        Runnable r1 = numbers::printOdd;

        Thread t1 = new Thread(r1);

        Runnable r2 = numbers::printEven;

        Thread t2 = new Thread(r2);


        t1.start();
        t2.start();
    }
}

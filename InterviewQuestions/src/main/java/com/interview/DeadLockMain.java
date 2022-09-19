package com.interview;

public class DeadLockMain {
    public static void main(String[] args) {
        DeadLockExample lockExample = new DeadLockExample();


        Runnable r1 = lockExample::displayr1;

        Thread t1 = new Thread(r1);

        Runnable r2 = lockExample::displayr2;

        Thread t2 = new Thread(r2);


        t1.start();
        t2.start();

    }
}

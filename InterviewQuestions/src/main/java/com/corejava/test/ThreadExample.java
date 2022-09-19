package com.corejava.test;

class ThreadExam implements Runnable{

    int job;
    @Override
    public void run() {
        job++;
        System.out.println(job);
    }
}

public class ThreadExample{
    public static void main(String[] args) {
        ThreadExam j1 = new ThreadExam();
        Thread t1 =  new Thread(j1);

        ThreadExam j2 = new ThreadExam();
        Thread t2 = new Thread(j2);

        t1.start();
        t2.start();
    }
}

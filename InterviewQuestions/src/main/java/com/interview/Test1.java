package com.interview;

class myThread implements Runnable
{
    public void run()
    {
        Test1.obj.notify();
    }
}

public class Test1 implements Runnable
{
    public static Test1 obj;
    private int data;
    public Test1()
    {
        data = 10;
    }
    public void run()
    {
        obj = new Test1();
        try {
            obj.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.data += 20;

        System.out.println(obj.data);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Test1());
        Thread thread2 = new Thread(new myThread());

        thread1.start();
        thread2.start();

        System.out.printf(" DRM - ");
    }
}
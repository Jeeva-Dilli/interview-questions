package com.numbers.oddeven;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintEvenOddTester1 {
    public static void main(String ... args){
        Printer1 print = new Printer1(false);
        Thread t1 = new Thread(new TaskEvenOdd1(print, "Thread1", new AtomicInteger(1)));
        Thread t2 = new Thread(new TaskEvenOdd1(print,"Thread2" , new AtomicInteger(2)));
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd1 implements Runnable {
    Printer1 print;
    String name;
    AtomicInteger number;
    TaskEvenOdd1(Printer1 print, String name, AtomicInteger number){
        this.print = print;
        this.name = name;
        this.number = number;
    }

    @Override
    public void run() {

        System.out.println("Run method");
        while(number.get()<10){

            if(number.get()%2 == 0){
                print.printEven(number.get(),name);
            }
            else {
                print.printOdd(number.get(),name);
            }
            number.addAndGet(2);
        }

    }

}



class Printer1 {
    boolean isEven;

    public Printer1(boolean isEven) {
        this.isEven = isEven;
    }

    synchronized void printEven(int number, String name) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+": Even:" + number);
        isEven = false;
        notifyAll();
    }

    synchronized void printOdd(int number, String name) {
        while (isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+": Odd:" + number);
        isEven = true;
        notifyAll();
    }
}

package com.interview;

public class DeadLockExample {

    String r1 = "resource1";
    String r2 = "resource2";

    public void displayr1()
    {
        synchronized (r1)
        {
            try{

                System.out.println("Inside display1");

                Thread.sleep(5000);

                synchronized (r2)
                {
                    System.out.println("");
                }

                System.out.println("displayr1 completed");

            }catch (Exception e)
            {

            }



        }
    }

    public void displayr2()
    {
        synchronized (r2)
        {
            try{

                System.out.println("Inside display2");

                Thread.sleep(5000);

                synchronized (r1)
                {
                    System.out.println("");
                }

                System.out.println("displayr2 completed");

            }catch (Exception e)
            {

            }



        }
    }
}

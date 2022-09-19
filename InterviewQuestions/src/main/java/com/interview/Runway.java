package com.interview;

import java.util.Queue;
import java.util.Scanner;

public class Runway
{
    public Scanner in;
    public Queue<String> takingOff;
    public Queue<String> landing;

    public Runway()
    {
        in = new Scanner(System.in);
        boolean done = false;
        while (!done)
        {
            System.out.println("Type TAKEOFF/LAND followed by Fight Number to Queue a plane");
            System.out.println("Type NEXT to perform the next action, or QUIT to quit the simulation");
            String action = in.next();
            if (action.equals("TAKEOFF"))
            {
                String flight = in.next();
                takingOff.add(flight);
            }
            else if (action.equals("LAND"))
            {
                String flight = in.next();
                landing.add(flight );
            }
            else if (action.equals("NEXT"))
            {
                handleNextAction();
            }
            else if (action.equals("QUIT"))
            {
                done = true;
            }
            else {
                System.out.println("ERROR - not a valid command");
            }
        }
    }

    public void handleNextAction()
    {
        if (landing.size() > 0)
        {
            String flight = landing.remove();
            System.out.println("Flight " + flight + " is landing. ");
        }
        else if (takingOff.size() > 0)
        {
            String flight = takingOff.remove();
            System.out.println("Flight " + flight + " is taking off.");
        }
        else
        {
            System.out.println("There are no flights waiting to take off or land");
        }
    }

    public static void main (String[] args)
    {
        Runway simulator = new Runway();
    }
}

package com.interview;

public class MultiplicationExample4
{
    static int product(int a, int b)
    {
        if (b == 0)
            return 0;
        if (b > 0)
            return (a + product(a, b - 1));
        if (b < 0)
            return -product(a, -b);
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println("The multiplication is: " + product(-5, 9));
        System.out.println("The multiplication is: " + product(-8, -17));
        System.out.println("The multiplication is: " + product(12, 12));
        System.out.println("The multiplication is: " + product(0, 12));
        System.out.println("The multiplication is: " + product(12, 0));
    }
}

package interview.probs;

import java.util.Stack;

public class BalancedParan {

    static boolean areParanthesisBalanced(String expr)
    {
        Stack<Character> stack = new Stack<>();

        if(expr== null || expr.isEmpty())
            return false;

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{'|| x == '<') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    if (stack.peek() == '(')
                        stack.pop();
                    break;
                case '}':
                    if (stack.peek() == '{')
                        stack.pop();
                    break;
                case ']':
                    if (stack.peek() == '[')
                        stack.pop();
                    break;
                case '>':
                    if (stack.peek() == '<')
                        stack.pop();
                    break;
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        String expr = "";
        if (areParanthesisBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

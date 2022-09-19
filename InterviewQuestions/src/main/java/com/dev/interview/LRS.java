package com.dev.interview;

public class LRS {
    public static void main(String[] args) {
        String longest = longestRepeatedSubstring("abcabcbb");
        System.out.println(longest);
    }

    public static String longestRepeatedSubstring(String text)
    {
        String longestRepeatedSubstring = "";
        for (int i = 0; i<text.length(); i++ )
        {
            String one = text.substring(0,i);

            for(int o = 0; o<text.length();o++)
            {
                String two = text.substring(0,o);
                if(one.equals(two))
                {
                    longestRepeatedSubstring = one;
                }

            }

        }
        return longestRepeatedSubstring;
    }

}

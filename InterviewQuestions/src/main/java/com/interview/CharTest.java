package com.interview;

import java.util.HashMap;
import java.util.Map;

public class CharTest {
    public static void main(String[] args) {
        String s = "Test343";
        cowBull("1314","1431");

    }

    public static void solution(String orginal, String guess) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < orginal.length(); i++) {
            char s = orginal.charAt(i);
            char g = guess.charAt(i);

            if (s == g)
                bull++;
            else if (orginal.contains(String.valueOf(s))) {
                cow++;
            }

        }

        System.out.println("Bulls : "+bull+"  Cows :"+cow);
    }

    static void cowBull(String orginal, String guess)
    {
        int bull = 0;
        int cow = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < orginal.length(); i++) {
            char s = orginal.charAt(i);
            if(map.containsKey(s))
            map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }

        for (int i = 0; i < orginal.length(); i++) {
            char s = orginal.charAt(i);
            char g = guess.charAt(i);

            if(s == g) {
                bull++;
                int c = map.get(g);
                if(c>1)
                    map.put(s,c-1);
                else
                    map.remove(s);
            }
            else if(map.containsKey(g))
                cow++;

        }

        System.out.println("Cows "+cow+" Bulls "+bull);

    }
}

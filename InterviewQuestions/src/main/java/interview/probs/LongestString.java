package interview.probs;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args) {
        String s[] = new String[]{"jee","jeeva","je","aerjee"};

        Arrays.sort(s, Comparator.comparingInt(String::length));
        String result="";
        for(int i=0;i<s[0].length();i++)
        {
            for(int j=i+1;j<s[0].length();j++)
            {
                String sub = s[0].substring(i,j);
                for(int k=1;k<s.length;k++) {
                    if (sub.contains(s[k])) {
                        result=sub;
                    }
                }

            }
        }

        System.out.println(result);

        for(String str:s)
        {
            System.out.println(str);
        }
    }
}

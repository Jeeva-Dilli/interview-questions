package com.dev.util;

public class RotateString {
	
	public static void main (String[] args)
    {
        String str1 = "hello from here";
        String str2 = "rehello from he";
  
        if (areRotations(str1, str2))
            System.out.println("YES");
        else
            System.out.printf("NO");
    }
	
	static boolean areRotations(String str1, String str2)
    {
		if (str1.length()==str2.length())
		{
        String string1 = str1.replaceAll("\\s", "");    // hellofromhere
        String string2 = str2.replaceAll("\\s", "");    //rehellofromhe
        
        return (string1+string1).contains(string2); //hellofromherehellofromhere  contains rehellofromhe
		}
		else
			return false;
    }

}

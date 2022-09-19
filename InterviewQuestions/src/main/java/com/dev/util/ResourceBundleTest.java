package com.dev.util;

import java.util.ResourceBundle;

public class ResourceBundleTest {
	
	public static ResourceBundle rb = ResourceBundle.getBundle("crypto");
	public static void main(String[] args) {
		String s = rb.getString("PROPERTES_YOUR_KEY");
		
		if(s == null || s.isEmpty())
		{
			System.out.println("string is null");
		}
		else
		{
			System.out.println("string not null");
		}
	}

}

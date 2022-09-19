package com.dev.util;

public class SwapwithoutTemp {
	public static void main(String[] args) {
		int a= 234;
		int b= 545;
		
		a=a+b;  
		b=a-b;  
		a=a-b;  
		
		System.out.println("a : "+a+" b : "+b);
	}

}

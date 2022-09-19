package com.dev.util;

public class ArrayExample {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,5,3,2,3,2};
		int count=0; 
		for(int i:array)
		{
			count++;
		}
		System.out.println(count);
	}

}

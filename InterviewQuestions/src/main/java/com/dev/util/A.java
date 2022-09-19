package com.dev.util;

import java.util.concurrent.CopyOnWriteArrayList;

public class A extends Object {
	public static void main(String[] args) {
		
		Object a = new A();
		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
		numbers.add(12);
		numbers.add(20);
		
		for(Integer n: numbers)
		{	
			numbers.add(20);  // fail-safe
			System.out.println(n);   		
			// ConcurrentHashMap, CopyOnWriteArrayList,  are Fail-Safe in nature.
		}

	}

}

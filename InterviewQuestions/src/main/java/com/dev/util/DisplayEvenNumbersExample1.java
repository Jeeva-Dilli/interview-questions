package com.dev.util;

public class DisplayEvenNumbersExample1 {
	public static void main(String args[]) {
		int number[] = {10,3,5,6,8};
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.print(number[i] + " ");
			}
		}
	}
}

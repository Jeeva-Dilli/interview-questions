package com.dev.util;

class Employee {

	private int regno;
	private String name;
	
	public Employee(int regno, String name) {
		this.name = name;
		this.regno = regno;
	}
	public int getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		
		Employee other = (Employee) obj;
		
		if (!this.name.equals(other.name))
			return false;
		
		/*if (this.regno != other.regno)
			return false;*/
		
		
		return true;
	}
	
}
public class EqualsExample{
	public static void main(String[] args) {
		Employee emp1= new Employee(918,"AA");
		Employee emp2= new Employee(917,"AA");
		
		System.out.println(emp1.equals(emp2));
	}
}

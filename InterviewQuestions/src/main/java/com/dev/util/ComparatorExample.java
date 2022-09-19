package com.dev.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 {
	int rollno;
	String name;
	int age;
	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Comparator<Student1> comparator = Comparator.comparing(s -> s.name);
		

		Collections.sort(al, comparator);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}

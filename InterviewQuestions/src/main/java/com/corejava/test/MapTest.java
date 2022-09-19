package com.corejava.test;

import java.util.HashMap;
import java.util.Map;

class Student{
    int id;

    public Student(int id)
    {
        this.id=id;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;


        if(!(obj instanceof Student))
            return false;

            Student s = (Student)obj;

        if ( this.id == s.id)
            return true;

        return false;
    }
}


public class MapTest {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);

        Map<Student,String> map = new HashMap<>();
        map.put(new Student(1),"test");
        map.put(new Student(1),"name");

        System.out.println(map.get(new Student(1)));
        System.out.println(map);
    }
}

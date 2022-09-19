package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee2 {

    public static void main(String[] args) {
        Integer i = 5000;
        int in = i.byteValue();
        System.out.println(in);
        List <Employee1> list=new ArrayList<>();
        list.add(new Employee1(3,"aaaa",20000));
        list.add(new Employee1(2,"bbbb",10000));
        list.add(new Employee1(1,"cccc",5000));
        Comparator<Employee1> cmp =  Comparator.comparing(Employee1::getSal);
        list.sort(cmp);

        list.forEach(e->System.out.println(e.sal));
    }
    public static void Listtest(List<Integer> list)
    {
        list .add(10);
    }

    static class Employee1{
        int id;
        String name;
        double sal;
        public Employee1(int id,String name,double sal)
        {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }
    }
}

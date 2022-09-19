package com.corejava.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,4,2,2,5};

        Pair p = getKlargest(arr,3);
        assert p != null;
        System.out.println(p.getElement()+"  "+ p.getIndex());


    }
    public static Pair getKlargest(int[] arr, int k)
    {
        Pair p = null;
        Set<Pair> list = new TreeSet<>(Comparator.comparingInt(Pair::getElement).reversed());
        for(int i =0 ; i<arr.length;i++)
        {
            list.add(new Pair(arr[i],i));
        }
        list.forEach(pr-> System.out.println(pr.element));
        int n = list.size();

        if(k>n)
            return null;
        int j = 1;
        for (Pair pair : list) {
            p = pair;
            if (j == k)
                return p;
            else
                j++;
        }
        return p;
    }
    static class Pair{
        int element;
        int index;
        public Pair(int element,int index)
        {
            this.element = element;
            this.index = index;
        }

        public int getElement() {
            return element;
        }

        public int getIndex() {
            return index;
        }

    }

}

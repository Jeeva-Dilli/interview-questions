package com.ds.cache;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheExample {

        Set<Integer> cache;
        int capacity;

        public LRUCacheExample(int capacity)
        {
            this.cache = new LinkedHashSet<>(capacity);
            this.capacity = capacity;
        }
        public boolean get(int key)
        {
            if (!cache.contains(key))
                return false;
            cache.remove(key);
            cache.add(key);
            return true;
        }
        public void get_Value(int key)
        {
            if (!get(key))
                put(key);
        }

        public void display()
        {
            LinkedList<Integer> list = new LinkedList<>(cache);
            list.forEach(System.out::println);
        }
        public void put(int key)
        {

            if (cache.size() == capacity) {
                int firstKey = cache.iterator().next();
                cache.remove(firstKey);
            }

            cache.add(key);
        }
        public static void main(String[] args)
        {
            LRUCacheExample obj = new LRUCacheExample(4);
            obj.get_Value(4);
            obj.get_Value(5);
            obj.get_Value(6);
            obj.get_Value(4);
            obj.get_Value(7);
            obj.get_Value(5);
            obj.display();
        }
    }
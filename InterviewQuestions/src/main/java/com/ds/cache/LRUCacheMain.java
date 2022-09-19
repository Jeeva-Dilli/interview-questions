package com.ds.cache;

import java.util.Map;

public class LRUCacheMain {
    public static void main(String[] args) {
        LRUCache<Integer> cache = new LRUCache(3);
        cache.put("1",2); //2 time
        cache.put("3",4);  // 1 time
        cache.put("5",6); // 1,3,5   - dlinked list
        cache.get("1");  // 1, 3 , 5   -- same
        cache.get("3");  // 3 , 1, 5
        cache.put("1",5); // 1 , 3 , 5
        cache.put("6",7); // remove 5 , add 6  --> 6,1,3

    }
}

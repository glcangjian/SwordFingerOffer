package com.example.swordfingeroffer.dataStructure.LRU;

import java.util.*;

/**
 * @功能名称: LinkedHashMap实现LRU
 * @文件名称：LRU3.java
 * @Date: 2020/3/8 2:23 PM
 * @Author: linxin.guo
 **/
public class LRU3 {
    private int capacity;
    private Map<Integer, Integer> cache;

    public LRU3(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int val) {
        cache.put(key, val);
    }

    public static void main(String[] args) {
        LRU3 lru3 = new LRU3(3);
        lru3.put(1,2);
        lru3.put(3,4);
        lru3.put(5,6);
        lru3.put(7,8);
        lru3.get(3);
        lru3.put(9,10);
        System.out.println(lru3.get(5));
    }

}

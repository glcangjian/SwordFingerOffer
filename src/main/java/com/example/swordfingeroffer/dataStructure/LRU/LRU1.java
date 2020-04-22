package com.example.swordfingeroffer.dataStructure.LRU;

/**
 * @功能名称: 单链表实现LRU
 * @文件名称：LRU1.java
 * @Date: 2020/3/8 11:48 AM
 * @Author: linxin.guo
 **/

/**
 * 题目：Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations:
 * get and set.
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item
 *
 * 思路 ：维护一个有序单链表，规定越靠近表尾的结点是越早访问的。当访问新页面 get(key) 时，从表头遍历链表，
 * 如果该页面已存在，则将其从原来位置删除，然后插入到表头。加载页面 put(key,value) 时，若该页面不存在且链表未满，
 * 则将页面插入表头。否则，删除表尾结点，再将新页面插入表头
 *
 */
public class LRU1 {
    private Node head;
    private int capacity;
    private int size;

    public LRU1(int capacity) {
        this.capacity = capacity;
        head = new Node();
    }

    public int get(int key) {
        // 访问数据时，先检查是否已存在
        Node copy = head;
        if (copy.key == key) {
            return copy.val;
        }
        while (copy.next != null) {
            //存在的话，先删除然后将数据插入到表头并返回
            if (copy.next.key == key) {
                Node ret = copy.next; //先将目标节点保存
                //删除目标节点
                copy.next = copy.next.next;
                //插入到表头
                ret.next = head.next;
                head.next = ret;
                return ret.val;
            }
            copy = copy.next;
        }
        // 不存在返回-1
        return -1;
    }

    public void put(int key, int val) {
        // 先检查链表是否已满，满的话淘汰尾部数据，将新数据加入到表头
        //未满直接将数据加入表头
        if (size < capacity) {
            // 未满
            Node node = new Node(key, val);
            node.next = head.next;
            head.next = node;
            size++;
        } else {
            //淘汰尾部数据
            Node copy = head;
            while (copy.next.next != null) {
                copy = copy.next;
            }
            // 删除尾部最后一个节点,
            copy.next = null;
            //将节点加入表投，一删一增，故size不用变
            Node node = new Node(key, val);
            node.next = head.next;
            head.next = node;
        }
    }

    public static void main(String[] args) {
        LRU1 lru1 = new LRU1(3);
        lru1.put(1,2);
        lru1.put(3,4);
        lru1.put(5,6);
        lru1.get(3);
        lru1.put(7,8);
        System.out.println(lru1.get(1));
    }

    class Node {
        private int key;
        private int val;
        private Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }


}

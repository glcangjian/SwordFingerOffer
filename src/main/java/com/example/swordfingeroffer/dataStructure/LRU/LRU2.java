package com.example.swordfingeroffer.dataStructure.LRU;

import java.util.HashMap;
import java.util.Map;

/**
 * @功能名称: hashMap + 双向链表实现LRU
 * @文件名称：LRU2.java
 * @Date: 2020/3/8 1:09 PM
 * @Author: linxin.guo
 **/
public class LRU2 {
    private Node head;
    private Node tail;
    private int capacity;
    private int size;

    private Map<Integer,Node> map = new HashMap<>();

    public LRU2(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        // 访问数据时，先检查是否已存在
        Node node = map.get(key);
        if (node != null){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            //数据插入表头；
            appendHead(node);
            return node.val;
        }
        // 不存在返回-1
        return -1;
    }

    public void put(int key, int val) {
        Node n = map.get(key);
        //数据存在，则更新value;
        if (n != null){
            n.val = val;
            map.put(key,n);
            n.prev.next = n.next;
            n.next.prev = n.prev;
            appendHead(n);
        }
        // 数据不存在，检查链表是否已满，满的话淘汰尾部数据，将新数据加入到表头
        //未满直接将数据加入表头
        if (map.size() < capacity) {
            // 未满
            Node node = new Node(key, val);
            appendHead(node);
            map.put(key,node);
        } else {
            //淘汰尾部数据,并插入到头部
            Node tmp = tail.prev;
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
            map.remove(tmp.key);

        }
        n = new Node(key,val);
        appendHead(n);
        map.put(key,n);
    }

    private void appendHead(Node node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public static void main(String[] args) {
        LRU2 lru2 = new LRU2(3);
        lru2.put(1,2);
        lru2.put(3,4);
        lru2.put(5,6);
        lru2.put(3,9);
        System.out.println(lru2.get(3));
    }

    class Node {
        private int key;
        private int val;
        private Node prev;
        private Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public void sync(int indepent,double dub){

    }
}

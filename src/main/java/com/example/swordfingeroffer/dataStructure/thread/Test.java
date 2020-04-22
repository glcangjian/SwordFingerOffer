package com.example.swordfingeroffer.dataStructure.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @功能名称:
 * @文件名称：Test.java
 * @Date: 2020/3/26 10:44 AM
 * @Author: linxin.guo
 **/
public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(1);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.element());

    }
}

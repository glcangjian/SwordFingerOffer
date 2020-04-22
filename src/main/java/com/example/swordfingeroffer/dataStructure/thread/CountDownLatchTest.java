package com.example.swordfingeroffer.dataStructure.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @功能名称:
 * @文件名称：CountDownLatchTest.java
 * @Date: 2020/3/25 2:45 PM
 * @Author: linxin.guo
 **/
public class CountDownLatchTest {

    private static CountDownLatch count = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                count.countDown();
                System.out.println(2);
                count.countDown();
            }
        }).start();
        count.await(1000,TimeUnit.MILLISECONDS);
        System.out.println(3);
        CyclicBarrier c = new CyclicBarrier(3);
//        ThreadLocal

    }
}

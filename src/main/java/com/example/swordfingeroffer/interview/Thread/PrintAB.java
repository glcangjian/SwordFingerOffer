package com.example.swordfingeroffer.interview.Thread;

/**
 * @功能名称: 使用两个线程轮流打印A和B
 * @文件名称：PrintAB.java
 * @Date: 2020/4/13 2:01 PM
 * @Author: linxin.guo
 **/
public class PrintAB {

    private static boolean flag = true;
    private static PrintAB printAB = new PrintAB(); //作为两个线程之间的共同锁对象
    private static int count = 0;

    public static void main(String[] args) {
        new Thread(new PrintA()).start();
        new Thread(new PrintB()).start();
    }

    static class PrintA implements Runnable{

        @Override
        public void run() {
            synchronized (printAB){
                while(count < 20){
                    if (flag){
                        System.out.print("A ");
                        count ++;
                        flag = false;
                        printAB.notify();
                    } else {
                        try {
                            printAB.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    static class PrintB implements Runnable{

        @Override
        public void run() {
            synchronized (printAB){
                while (count < 20){
                    if (!flag){
                        System.out.print("B ");
                        count++;
                        flag = true;
                        printAB.notify();
                    } else {
                        try{
                            printAB.wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

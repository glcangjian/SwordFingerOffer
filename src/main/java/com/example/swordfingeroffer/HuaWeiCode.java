package com.example.swordfingeroffer;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @功能名称:
 * @文件名称：HuaWeiCode.java
 * @Date: 2020/4/16 8:13 PM
 * @Author: linxin.guo
 **/
public class HuaWeiCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] num = new String[N][4];
        for (int i = 0; i < N; i++) {
            num[i][0] = sc.next();
            num[i][1] = sc.next();
            num[i][2] = sc.next();
            num[i][3] = sc.next();
        }
        // 根据金牌数量排序
        for (int i = 0; i < N - 1; i++) {
            int temp = 0;
            for (int j = 1; j <= N - i -1; j++) {
                if (Integer.parseInt(num[j - 1][1]) < Integer.parseInt(num[j][1])) {
                    temp = j;
                } else {
                    temp = Math.max(j-1,temp);
                }
            }
            // 找到金牌最大的那个国家将其放到数组最后
            for (int x = 0; x < 4; x++) {
                String temp1 = num[temp][x];
                num[temp][x] = num[N-i-1][x];
                num[N-i-1][x] = temp1;
            }
        }
        for (int i = 0 ;i < N;i++){
            System.out.print(num[i][0]+" ");
            System.out.print(num[i][1]+" ");
            System.out.print(num[i][2]+" ");
            System.out.print(num[i][3]+" ");
            System.out.println();
        }

//        ReentrantLock
//        ThreadPoolExecutor
//        Executors

    }
}

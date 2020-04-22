package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 二进制中1的个数
 * @文件名称：Eleven.java
 * @Date: 2020/4/14 9:13 PM
 * @Author: linxin.guo
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 **/
public class Eleven {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0 ){
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}

package com.example.swordfingeroffer.swordFinger.ten;

/**
 * @功能名称:斐波那契数列
 * @文件名称：Seven.java
 * @Date: 2020/4/14 9:34 AM
 * @Author: linxin.guo
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 **/
public class Seven {
    // 递归
    public int Fibonacci(int n) {
        if (n < 2){
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n-2);
    }

    // 迭代
    public int Fibonacci1(int n) {
        if (n < 2)
            return n;
        int sum = 0;
        int one = 0, two = 1;
        while (n >= 2){
            sum  = one + two;
            one = two;
            two = sum;
            n--;
        }
        return sum;
    }

}

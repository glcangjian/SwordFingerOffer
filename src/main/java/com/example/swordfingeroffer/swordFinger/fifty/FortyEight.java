package com.example.swordfingeroffer.swordFinger.fifty;

/**
 * @ClassName：FortyEight.java
 * @Description: 不用加减乘除做加法
 * @Date: 2020/6/11 5:58 PM
 * @Author: lin.guo
 * 题目描述：写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 **/
public class FortyEight {

    public int Add(int num1,int num2) {
        return result(num1,num2);

        /*
        while(num2 != 0){
        int sum1 = num1 ^ num2;
        int num2 = (num1 & num2) << 1;
        num1 = sum1;
        }
        return num1;    //非递归解法
        */

    }

    public int result(int num1,int num2){
        if (num2 == 0)
            return num1;
        int sum1 = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        return result(sum1 , carry);
    }

}

package com.example.swordfingeroffer.swordFinger.fifty;

/**
 * @ClassName：FortyThree.java
 * @Description: 左旋转字符串
 * @Date: 2020/6/11 5:56 PM
 * @Author: lin.guo
 * 题目描述：汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 **/
public class FortyThree {

    public String LeftRotateString(String str, int n) {
        if (str.length() == 0)
            return str;
        String strstr = str + str;
        int len = str.length();
        int n1 = n % len;
        return strstr.substring(n, n + len);
    }
}

package com.example.swordfingeroffer.swordFinger.fifty;

/**
 * @ClassName：FortySeven.java
 * @Description: 求1+2+3+...+n
 * @Date: 2020/6/11 5:57 PM
 * @Author: lin.guo
 * 题目描述：求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 解题思路：可以去考虑一下二进制的方式解题
 **/
public class FortySeven {
    public int Sum_Solution(int n) {
        int sum = (int) (Math.pow(n,2)+n);
        return sum >> 1;
    }
}

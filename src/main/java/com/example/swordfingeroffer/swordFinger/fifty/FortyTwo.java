package com.example.swordfingeroffer.swordFinger.fifty;

import java.util.ArrayList;

/**
 * @ClassName：FortyTwo.java
 * @Description: 和为S的两个数字
 * @Date: 2020/6/11 5:56 PM
 * @Author: lin.guo
 * 题目描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述: 对应每个测试案例，输出两个数，小的先输出。
 * 解题思路：双指针求解
 **/
public class FortyTwo {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length <2)
            return list;
        int i = 0, j = array.length-1;
        while (i<j){
            if (array[i]+array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            } else if (array[i]+array[j] < sum){
                i++;
            } else {
                j--;
            }
        }
        return list;
    }
}

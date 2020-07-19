package com.example.swordfingeroffer.swordFinger.thirty;

import java.util.HashMap;

/**
 * @功能名称:数组中出现次数超过一半的数字
 * @文件名称：TwentyEight.java
 * @Date: 2020/4/25 9:47 PM
 * @Author: linxin.guo
 * 题目描述：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 解题：其实就是利用hash表求解
 **/
public class TwentyEight {

    public int MoreThanHalfNum_Solution(int[] array) {
        int length = array.length;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i]) > length / 2)
                return array[i];
        }
        return 0;
    }

}

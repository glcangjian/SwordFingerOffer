package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称: 第一个只出现一次的字符
 * @文件名称：ThirtyFour.java
 * @Date: 2020/4/27 9:39 AM
 * @Author: linxin.guo
 * 题目描述：在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * 解题思路：利用hash表，因为题目已指明是字母
 **/
public class ThirtyFour {

    public int FirstNotRepeatingChar(String str) {
        if (str.isEmpty())
            return -1;
        int[] hash = new int[256];
        char index;
        for (int i = 0; i < str.length(); i++){
            index = str.charAt(i);
            hash[index]++;
        }
        for (int i = 0; i < str.length(); i++){
            index = str.charAt(i);
            if (hash[index] == 1){
                return i;
            }
        }
        return -1;
    }
}

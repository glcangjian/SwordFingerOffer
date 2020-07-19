package com.example.swordfingeroffer.swordFinger.ten;

/**
 * @功能名称: 替换空格
 * @文件名称：Two.java
 * @Date: 2020/4/14 9:32 AM
 * @Author: linxin.guo
 * 题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 **/
public class Two {
    public static String replaceSpace(StringBuffer str) {
        String str1=str.toString();
        char[] charArray = str1.toCharArray();
        StringBuilder sBuilder = new StringBuilder();
        for (char c : charArray) {
            if(c==' ') {
                sBuilder.append("%20");
            }else {
                sBuilder.append(c);
            }
        }
        String string = sBuilder.toString();
        return string;
    }
}

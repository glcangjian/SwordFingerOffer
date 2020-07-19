package com.example.swordfingeroffer.swordFinger.fifty;

import java.util.Stack;

/**
 * @ClassName：FortyFour.java
 * @Description: 翻转单词顺序列
 * @Date: 2020/6/11 5:57 PM
 * @Author: lin.guo
 * 题目描述: 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * 解题思路：利用栈，这里的话也可以不用栈，直接从尾到头遍历这个分割后的数组
 **/
public class FortyFour {

    public static String ReverseSentence(String str) {
        if (str == "")
            return str;
        String[] strs = str.split(" ");
        if (strs.length == 0)  //这里是判断字符串中全是空格的情况
            return str;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            stack.push(strs[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" "); //添加字符间的空格
        }
        String ret = sb.toString();
        return ret.substring(0,ret.length()-1); //去掉字符串的最后一个空格
    }

    public static void main(String[] args) {
        String string = "I am a student.";
        System.out.println(ReverseSentence(string));
        String str = " ";
        String[] strs = str.split(" ");
        /*if (strs[0] == ""){
            System.out.println("空字符串");

        }*/
        System.out.println(strs.length);
    }
}

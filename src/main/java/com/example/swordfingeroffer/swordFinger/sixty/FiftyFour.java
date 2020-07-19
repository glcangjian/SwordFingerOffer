package com.example.swordfingeroffer.swordFinger.sixty;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName：FiftyFour.java
 * @Description: 字符流中第一个不重复的字符
 * @Date: 2020/6/11 6:00 PM
 * @Author: lin.guo
 * 题目描述：请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 输出描述: 如果当前字符流没有存在出现一次的字符，返回#字符。
 **/
public class FiftyFour {
    //Insert one char from stringstream
    HashMap<Character, Integer> map = new HashMap<>();
    Queue<Character> queue = new LinkedBlockingQueue<>();

    public void Insert(char ch) {
        if (!map.containsKey(ch)) {
            queue.add(ch);
            map.put(ch, 1); //第一次出现在hash表中计数
        } else {
            map.put(ch, map.get(ch) + 1);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        while (!queue.isEmpty()){
            Character character = queue.poll();
            if (map.get(character) == 1)
                return character;
        }

        return '#';
    }
}

package com.example.swordfingeroffer.swordFinger.ten;

/**
 * @功能名称: 跳台阶
 * @文件名称：Eight.java
 * @Date: 2020/4/14 9:34 AM
 * @Author: linxin.guo
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 **/
public class Eight {

    // 递归，这里有点不同的是0阶的时候跳法也是1
    public int JumpFloor(int target) {
        if (target == 0 || target == 1){
            return 1;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}

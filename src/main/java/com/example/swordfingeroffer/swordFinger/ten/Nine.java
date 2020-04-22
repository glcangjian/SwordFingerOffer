package com.example.swordfingeroffer.swordFinger.ten;

/**
 * @功能名称: 变态跳台阶
 * @文件名称：Nine.java
 * @Date: 2020/4/14 9:35 AM
 * @Author: linxin.guo
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 **/
public class Nine {

    public int JumpFloorII(int target) {
        /*f(n) = f(n-1) + f(n-2) + **** +f(1);
        f(n-1) = f(n-2) + f(n-3) + ** +f(1);
        f(n) = 2f(n-1);*/
        if (target == 1){
            return 1;
        }
        return 2*JumpFloorII(target -1);
    }
}

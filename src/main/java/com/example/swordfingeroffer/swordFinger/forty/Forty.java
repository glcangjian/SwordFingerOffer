package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称:数组中只出现一次的数字
 * @文件名称：Forty.java
 * @Date: 2020/4/27 9:41 AM
 * @Author: linxin.guo
 * 题目描述：一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 **/
public class Forty {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int ret = 0;
        int flag = 1;
        for (int i=0;i<array.length;i++){
            ret ^= array[i];
        }
        while ((ret & flag) == 0)
            flag <<= 1;
        for(int j =0;j<array.length;j++){
            if((flag & array[j]) == 0)
                num1[0] ^= array[j];
            else
                num2[0] ^= array[j];
        }

    }
}

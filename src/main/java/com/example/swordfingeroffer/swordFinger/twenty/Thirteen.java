package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 调整数组顺序使奇数位于偶数前面
 * @文件名称：Thirteen.java
 * @Date: 2020/4/14 9:14 PM
 * @Author: linxin.guo
 * 题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 **/
public class Thirteen {

    /**
     * 用双指针求解,这里用快慢指针求解，慢指针指向将要存储奇数的索引位置
     * 等待快指针去找奇数，找到后就跟满指针处的值交互
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        if (nums.length == 0)
            return nums;
        int slow = 0,fast = 0;
        while (fast < nums.length){
            if (nums[fast]%2 != 0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return nums;
    }


}

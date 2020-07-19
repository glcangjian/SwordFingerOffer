package com.example.swordfingeroffer.swordFinger.thirty;

/**
 * @功能名称:二叉搜索树的后续遍历序列
 * @文件名称：TwentyThree.java
 * @Date: 2020/4/25 9:46 PM
 * @Author: linxin.guo
 * 题目描述：输入一个非空整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 * 参考：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/
 **/
public class TwentyThree {
    public boolean VerifySquenceOfBST(int[] sequence) {
        return recur(sequence, 0, sequence.length - 1);
    }

    public boolean recur(int[] tar, int i, int j) {
        if (i >= j) {
            return true; //递归截止条件；
        }
        int m = 0;
        while (tar[m] < tar[j]){
            m++;
        }
        int m1 = m;
        while (tar[m1] > tar[j]){
            m1++;
        }
        return m1 == j && recur(tar,i,m-1) && recur(tar,m,j-1);
    }
}

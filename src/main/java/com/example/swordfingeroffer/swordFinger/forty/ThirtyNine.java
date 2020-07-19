package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称:
 * @文件名称：ThirtyNine.java
 * @Date: 2020/4/27 9:40 AM
 * @Author: linxin.guo
 * 题目描述：输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 **/

public class ThirtyNine {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    private boolean balance = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        recur(root);
        return balance;
    }

    public int recur(TreeNode root) {
        if (root == null)
            return 0;
        int left = recur(root.left);
        int right = recur(root.right);
        if (Math.abs(left - right) > 1)
            balance = false;
        return Math.max(left,right)+1;
    }
}

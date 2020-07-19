package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称:二叉树的深度
 * @文件名称：ThirtyEight.java
 * @Date: 2020/4/27 9:40 AM
 * @Author: linxin.guo
 * 题目描述：输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 **/
public class ThirtyEight {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    // 递归求解
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}

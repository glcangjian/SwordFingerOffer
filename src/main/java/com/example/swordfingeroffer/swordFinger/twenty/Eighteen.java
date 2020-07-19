package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 二叉树的镜像
 * @文件名称：Eighteen.java
 * @Date: 2020/4/14 9:16 PM
 * @Author: linxin.guo
 * 题目描述：操作给定的二叉树，将其变换为源二叉树的镜像
 **/
public class Eighteen {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    // 递归方法
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
    // 非递归方法
}

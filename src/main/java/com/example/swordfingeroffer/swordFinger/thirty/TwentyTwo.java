package com.example.swordfingeroffer.swordFinger.thirty;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @功能名称: 从上往下打印二叉树
 * @文件名称：TwentyTwo.java
 * @Date: 2020/4/25 9:45 PM
 * @Author: linxin.guo
 * 题目描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印
 **/
public class TwentyTwo {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    //其实就是利用队列，其余细节问题debug就OK了
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
        return list;
    }



}

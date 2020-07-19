package com.example.swordfingeroffer.swordFinger.ten;

import java.util.HashMap;
import java.util.Map;

/**
 * @功能名称: 重建二叉树
 * @文件名称：Five.java
 * @Date: 2020/4/14 9:34 AM
 * @Author: linxin.guo
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 **/
public class Four {
    class TreeNode {
        private int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
        return rebuildTree(pre, 0, pre.length - 1, in, 0, in.length - 1, map);
    }

    public TreeNode rebuildTree(int[] pre, int preStart, int preEnd,
                                int[] in, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        if (preStart == preEnd) {
            return root;
        } else {
            int curIndex = map.get(pre[preStart]);
            int leftNodes = curIndex - inStart;
            int rightNodes = inEnd - curIndex;
            root.left = rebuildTree(pre, preStart + 1, preStart + leftNodes, in, inStart, curIndex - 1, map);
            root.right = rebuildTree(pre, preEnd - rightNodes + 1, preEnd, in, curIndex + 1, inEnd, map);
            return root;
        }
    }
}

package com.example.swordfingeroffer.swordFinger.sixty;

/**
 * @ClassName：FiftySeven.java
 * @Description: 二叉树的下一个节点
 * @Date: 2020/6/11 6:01 PM
 * @Author: lin.guo
 * 题目描述：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 **/
public class FiftySeven {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null){
            return recur(pNode.right);
        }
        return null;
    }

    public TreeLinkNode recur(TreeLinkNode pNode) {
        // 中序遍历，左根
        //左子树是否为空
        if (pNode.left != null) {
            return GetNext(pNode.left);
        }
        /*//右子树是否为空
        if (pNode.right != null){
            return  GetNext(pNode.right);
        }*/
        //左右子树都为空，返回自己
        return pNode;
    }
}

package com.example.swordfingeroffer.swordFinger.thirty;

/**
 * @功能名称:二叉搜索树与双向链表
 * @文件名称：TwentySix.java
 * @Date: 2020/4/25 9:46 PM
 * @Author: linxin.guo
 * 题目描述：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 思路：结合二叉树的中序遍历
 * 参考：https://www.nowcoder.com/profile/163334/codeBookDetail?submissionId=1515508
 **/
public class TwentySix {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    TreeNode head = null;
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        recur(pRootOfTree);
        return head;
    }
    public void recur(TreeNode cur){
        if (cur == null)
            return;
        recur(cur.left);
        if (head == null){
            head = cur;
            pre = cur;
        } else {
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }
        recur(cur.right);
    }

}


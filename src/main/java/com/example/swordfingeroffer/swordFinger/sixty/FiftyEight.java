package com.example.swordfingeroffer.swordFinger.sixty;

/**
 * @ClassName：FiftyEight.java
 * @Description: 对称的二叉树
 * @Date: 2020/6/11 6:01 PM
 * @Author: lin.guo
 * 题目描述：请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 **/
public class FiftyEight {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null)
            return true;
        if (pRoot.left == null && pRoot.right == null){
            return true;
        }
        if (pRoot.left != null & pRoot.right != null){
            return pRoot.left.val == pRoot.right.val && isSymmetrical(pRoot.left)
                    && isSymmetrical(pRoot.right);
        }
        return false;
    }
}

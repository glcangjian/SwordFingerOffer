package com.example.swordfingeroffer.swordFinger.thirty;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @功能名称: 二叉树中和为某一值的路径
 * @文件名称：TwentyFour.java
 * @Date: 2020/4/25 9:46 PM
 * @Author: linxin.guo
 * 解题思路，其实就是先序遍历，然后将符合条件的值都加入到结果当中
 * 在代码的38行，要重新new一个list，而不能把全局变量的list对象直接加入，否则最后结果会得到空值
 * 因为list只是一个引用，如果加入这个全局引用，那么这个list发送修改的时候，你结果其实就在改变了
 **/
public class TwentyFour {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    private int sum = 0;
    private ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return arrayList;
        }
        sum += root.val;
        list.add(root.val);
        if (sum == target && root.left == null && root.right == null) {
            arrayList.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        sum -= list.get(list.size()-1);
        list.remove(list.size()-1);
        return arrayList;
    }

    /*public static void main(String[] args) {
        TwentyFour twentyFour = new TwentyFour();
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(12);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        twentyFour.FindPath(treeNode1,22);
    }*/

}

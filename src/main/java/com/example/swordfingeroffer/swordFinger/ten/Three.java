package com.example.swordfingeroffer.swordFinger.ten;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @功能名称: 从尾到头打印链表
 * @文件名称：Three.java
 * @Date: 2020/4/14 9:32 AM
 * @Author: linxin.guo
 * 题目描述：输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 **/
public class Three {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode == null)
            return list;
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            ListNode listNode1 = stack.pop();
            list.add(listNode1.val);
        }
        return list;
        //还可以通过递归来求解
    }

}

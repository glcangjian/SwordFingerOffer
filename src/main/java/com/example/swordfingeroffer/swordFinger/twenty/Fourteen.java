package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 链表中倒数第K个节点
 * @文件名称：Fourteen.java
 * @Date: 2020/4/14 9:14 PM
 * @Author: linxin.guo
 * 题目描述：输入一个链表，输出该链表中倒数第k个结点
 **/
public class Fourteen {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    // 双指针，先让p走k步，然后p和head一起走，直到p为null
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0)
            return null;
        ListNode p = head;
        while(k>0){
            if (p == null)
                return null;
            p = p.next;
            k--;
        }
        while (head !=null && p != null){
            p = p.next;
            head = head.next;
        }
        return head;
    }
}

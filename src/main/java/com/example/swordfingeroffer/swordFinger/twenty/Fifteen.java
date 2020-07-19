package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 反转链表
 * @文件名称：Fifteen.java
 * @Date: 2020/4/14 9:14 PM
 * @Author: linxin.guo
 * 题目描述：输入一个链表，反转链表后，输出新链表的表头
 **/
public class Fifteen {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    // 定义一个新的空链表，一边遍历，一边修改结构
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode ret = null;
        while(head != null){
            ListNode next = head.next;
            head.next = ret;
            ret = head;
            head = next;
        }
        return ret;
    }

}

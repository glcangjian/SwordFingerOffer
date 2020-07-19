package com.example.swordfingeroffer.swordFinger.sixty;

import jdk.nashorn.internal.ir.LiteralNode;

/**
 * @ClassName：FiftyFive.java
 * @Description: 链表中环的入口结点
 * @Date: 2020/6/11 6:00 PM
 * @Author: lin.guo
 * 题目描述：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 **/
public class FiftyFive {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (slow != null || fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow == null || fast.next == null)
            return null;    //无环情况
        while(pHead != slow){
            pHead = pHead.next;
            slow = slow.next;
        }
        return pHead;
    }
}

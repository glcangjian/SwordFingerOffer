package com.example.swordfingeroffer.swordFinger.sixty;

/**
 * @ClassName：FiftySix.java
 * @Description: 删除链表中重复的结点
 * @Date: 2020/6/11 6:01 PM
 * @Author: lin.guo
 * 题目描述: 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 **/
public class FiftySix {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode cur = pHead;
        ListNode pre = null;
        while (cur != null){
            if (pre == null){
                pre = cur;
                cur = cur.next;
            } else {
                if (pre.val == cur.val){
                    // 重复节点
                    pre.next = cur.next; //删除当前cur节点
                    cur = cur.next;
                } else {
                    pre = cur;
                    cur = cur.next;
                }
            }
        }
        return pHead;
    }
    //递归简洁版
    public ListNode deleteDuplication1(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return pHead;

        if (pHead.val == pHead.next.val){
            while (pHead.next != null && pHead.val == pHead.next.val){
                pHead = pHead.next;
            }
            return deleteDuplication(pHead.next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}

package com.example.swordfingeroffer.swordFinger.twenty;

/**
 * @功能名称: 合并两个排序的链表
 * @文件名称：Sixteen.java
 * @Date: 2020/4/14 9:14 PM
 * @Author: linxin.guo
 * 题目描述：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 **/
public class Sixteen {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    //递归实现
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode pMerge=null;
        if(list1.val<list2.val){
            pMerge=list1;
            pMerge.next=Merge(list1.next,list2);
        }else{
            pMerge=list2;
            pMerge.next=Merge(list1,list2.next);
        }
        return pMerge;
    }
    //迭代实现
    public ListNode Merge1(ListNode list1,ListNode list2){
        ListNode head = new ListNode(0);
        ListNode movnode = head;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                movnode.next = list2;
                list2 = list2.next;
            } else {
                movnode.next = list1;
                list1 = list1.next;
            }
            movnode = movnode.next;
        }
        if (list1 != null) {
            movnode.next = list1;
        }
        if (list2 != null) {
            movnode.next = list2;
        }
        return head.next;
    }


}

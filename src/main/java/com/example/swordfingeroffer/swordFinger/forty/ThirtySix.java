package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称: 两个链表的第一个公共节点
 * @文件名称：ThirtySix.java
 * @Date: 2020/4/27 9:40 AM
 * @Author: linxin.guo
 * 题目描述：输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * 经典解法：a+b = b+a(双指针)
 **/
public class ThirtySix {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }
        return p1;
    }
}

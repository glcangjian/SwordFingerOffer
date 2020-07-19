package com.example.swordfingeroffer.swordFinger.twenty;

import java.util.Stack;

/**
 * @功能名称: 包含min函数的栈
 * @文件名称：Twenty.java
 * @Date: 2020/4/14 9:16 PM
 * @Author: linxin.guo
 * 题目描述：
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法
 * 参考：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/solution/
 **/
public class Twenty {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();
    public void push(int node) {
       stack1.push(node);
       if (stack2.empty() || stack2.peek()>=node){
           stack2.push(node);
       }
    }

    public void pop() {
        int x = stack1.pop();
        if (stack2.peek() == x){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}

package com.example.swordfingeroffer.swordFinger.ten;

/**
 * @功能名称:二维数组中的查找
 * @文件名称：One.java
 * @Date: 2020/4/14 9:32 AM
 * @Author: linxin.guo
 * 题目描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数
 **/
public class One {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int i = array.length;
        int j = array[0].length;
        int row = 0, col = j - 1;
        while (row < i && col >= 0){
            if (target > array[row][col]){
                row++;
            } else if (target < array[row][col]){
                col--;
            } else {
                return true;
            }
        }
        return false;

        /*
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] == target)
                    return true;
            }
        }
        return false;
        */
    }
}

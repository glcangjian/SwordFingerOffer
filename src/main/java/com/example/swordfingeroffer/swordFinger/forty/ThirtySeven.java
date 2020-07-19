package com.example.swordfingeroffer.swordFinger.forty;

/**
 * @功能名称:数字在排序数组中出现的次数
 * @文件名称：ThirtySeven.java
 * @Date: 2020/4/27 9:40 AM
 * @Author: linxin.guo
 * 题目描述：统计一个数字在排序数组中出现的次数。
 * 解题思路：这道题肯定不只是遍历统计，还有别的解法，例如二分法
 **/
public class ThirtySeven {

    public int GetNumberOfK(int[] array, int k) {
        int left = 0, right = array.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid - 1;
            } else {
                // 这时找到了,p1往左边，p2往右边找
                int p1 = mid-1;
                int p2 = mid+1;
                count++; //下标为mid相等需计数一次
                while (p1 >=0){
                    if (array[p1--] == k)
                        count++;
                    else
                        break;
                }
                while (p2 <= right){
                    if (array[p2++] == k)
                        count++;
                    else
                        break;
                }
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //[1,2,3,3,3,3,4,5],3
        int[] array = {1,2,3,3,3,3,4,5};
        ThirtySeven a = new ThirtySeven();
        System.out.println(a.GetNumberOfK(array,3));
    }
}

package com.example.swordfingeroffer.interview.sort;

/**
 * @功能名称: 快速排序
 * @文件名称：QuickSort.java
 * @Date: 2020/4/13 2:56 PM
 * @Author: linxin.guo
 * 快速排序也是分治法思想的一种实现，他的思路是使数组中的每个元素与基准值（Pivot，通常是数组的首个值，A[0]）比较，
 * 数组中比基准值小的放在基准值的左边，形成左部；大的放在右边，形成右部；
 * 接下来将左部和右部分别递归地执行上面的过程：选基准值，小的放在左边，大的放在右边。。。直到排序结束
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 6, 5, 2, 3, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public void quickSort(int[] arr, int left, int right) {
        int mid = sort(arr, left, right);
        if (left < mid - 1) {
            sort(arr, left, mid - 1);
        }
        if (right > mid + 1) {
            sort(arr, mid + 1, right);
        }

    }

    public int sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        while (left < right) {
            while (arr[left] < arr[mid])  //这里的两个while都不要加＝
                left++;
            while (arr[right] > arr[mid]) {
                right--;
            }
            if (arr[left] > arr[right]) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }


}

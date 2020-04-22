package com.example.swordfingeroffer.interview.sort;

/**
 * @功能名称: 希尔排序
 * @文件名称：ShellSort.java
 * @Date: 2020/4/13 2:48 PM
 * @Author: linxin.guo
 * 基本思想：先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。
 * 所有距离为d1的倍数的记录放在同一个组中。先在各组内进行直接插入排序；然后，
 * 取第二个增量d2<d1重复上述的分组和排序，直至所取的增量dt=1(dt<dt-l<…<d2<d1)，
 * 即所有记录放在同一组中进行直接插入排序为止。该方法实质上是一种分组插入方法
 **/
public class ShellSort {
}

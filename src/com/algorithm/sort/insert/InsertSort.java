package com.algorithm.sort.insert;

import com.algorithm.sort.father.SortAbstr;

/**
 * 插入排序
 * 1.从第二个数据开始，到最后一个位置
 * 2.前面的为排序之后的，后面的未排序
 */
public class InsertSort extends SortAbstr {
    public void sort(Comparable[] a){
        //确定数据的开始和结尾开始数据是1，结尾为数组的最后一个元素
        for (int i = 1; i < a.length; i++) {
            //内循环，从最大的位置向最小的位置进行遍历
            for (int j = i; j >0 ; j--) {
                if (greater(a[j],a[j-1])){
                    exch(a,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
}

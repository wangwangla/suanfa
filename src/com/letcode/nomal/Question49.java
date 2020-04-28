package com.letcode.nomal;

import java.util.Arrays;

/**
 * 未排序的数组，求出最长的连续的子序列
 */
public class Question49 {
//    public static void main(String[] args) {
//        //先排序，然后后一个是不是比前一个大1、
//        //dp[i] 存储第i-1个元素所以最长子序列的个数
//    }

    /**
     * 这个是不考虑时间复杂度的
     * @param arr
     */
    public static int soul(int arr[]){
        Arrays.sort(arr);
        int dp [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            if (i>0&&arr[i]==arr[i-1]+1){
                dp[i] += dp[i-1];
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        System.out.println(soul(arr));
    }
}

package com.letcode.nomal;

/**
 * 一个数组，在适当的位置删除元素，使得数组不包含多余元素，返回数组的长度
 */
public class Question48 {
    public int soul(int arr[]){
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[j-1]){
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    public static int soul2(int arr[]){
        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]!=arr[j-1]){
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,3};
        soul2(arr);
    }
}

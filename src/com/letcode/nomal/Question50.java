package com.letcode.nomal;

public class Question50 {
    public void soul(int[] arr,int num){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]){
                arr [index++] = arr[i];
            }
        }

    }
}

package com.letcode.nomal;

public class Question51 {
    public void soul(int arr[]){
        int index =  0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[index] = arr[i];
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[index] = 0;
        }
    }
}

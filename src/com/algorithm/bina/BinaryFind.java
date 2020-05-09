package com.algorithm.bina;

public class BinaryFind {
//    public static void main(String[] args) {
//
//    }
//
    public void bina(int arr[],int key){
        int end = arr.length-1;
        int start = 0;
        int middle = 0;
        while (true){
            middle = (start + end)/2;
            if (arr[middle] == key){
                System.out.println();
            }else if (arr[middle]>key){
                end = middle - 1;
            }else {
                start = middle + 1;
            }
            if (start>end){
                break;
            }
        }
    }
}

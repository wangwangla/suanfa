package com.letcode.nomal;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Question44 {


    // Complete the miniMaxSum function below.
    static void miniMaxSum1(int[] arr) {
        Arrays.sort(arr);
        long sum1 = 0;
        long sum2 = 0;

        for(int i=0;i<arr.length;i++){
            if (i!=0) {
                sum1 = sum1 + arr[i];
            }
            if (i!=arr.length-1){
                sum2 = sum2 + arr[i];
            }
        }
        System.out.print(sum1 - arr[arr.length-1]+" ");
        System.out.print(sum2 - arr[0]);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
                sum = sum + arr[i];
        }
        System.out.print(sum - arr[arr.length-1]+" ");
        System.out.print(sum - arr[0]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] arr = new int[5];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < 5; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
        int arr [] = {256741038 ,
                      623958417,
                      467905213 ,
                      714532089 ,
                      938071625};
        miniMaxSum(arr);

     //   scanner.close();
    }

}

package com.letcode.nomal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question38 {
    public static void method(String[]arr){
        HashMap <String,List> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            List<String> list = hashMap.get(Arrays.toString(chars));
            if(list == null){
                list = new ArrayList();
            }
            list.add(Arrays.toString(arr[i].toCharArray()));
            hashMap.put(Arrays.toString(chars),list);
        }
        System.out.println("========================");
    }

    public static void main(String[] args) {
        String arr[] = new String[8];
        arr[0] = "ate";
        arr[1] = "tea";
        arr[2] = "eta";
        arr[3] = "who";
        arr[4] = "hwo";
        arr[5] = "owh";
        arr[6] = "ans";
        arr[7] = "sna";
        method(arr);
    }
}

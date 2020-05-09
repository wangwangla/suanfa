package com.letcode.nomal.tanxin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 超时
 36 / 39 个通过测试用例
 */
public class Question02 {
    public static boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        if (n%k != 0){
            return false;
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
        }
        for (int i=0;i<n/k;i++){
            int temp = list.get(0);
            System.out.println(list.indexOf(temp)+"====="+temp);
            list.remove(list.indexOf(temp));
            for (int j = 0; j < k-1; j++) {
                temp+=1;
                System.out.println(temp);
                if (list.contains(temp)){
                   // System.out.println(list.indexOf(temp)+temp);
                    list.remove(list.indexOf(temp));
                }else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5,6};
        System.out.println(isPossibleDivide(arr,4));
    }
}

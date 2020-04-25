package com.algorithm.dongtaiguihua;

public class Demo02 {
    /**
     * 青蛙能否跳到最后一个位置上
     * @param arr
     */
    public void method(int arr[]){
        //0到k-1,所以创建k的数组就可以了
        boolean dp[] = new boolean[arr.length];
        //遍历结果
        dp[0] =  true;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = false;
            for (int j = 0; j < i; j++) {
                if (dp[j]&&j+arr[j]>i)
                    dp[i] =true;
            }
        }
    }

    public static void main(String[] args) {

    }
}

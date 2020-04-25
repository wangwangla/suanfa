package com.algorithm.dongtaiguihua;

public class Demo03 {
    /**
     * 机器人从左上角到右下角，多少种方式
     * @param arr
     */
    public void mathod(int arr[][]){
        int dp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //有障碍
                if(arr[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                if (i==0||j==0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[arr.length-1][arr[0].length-1]);
    }
}

package com.algorithm.dongtaiguihua;

public class Demo10 {
    /**
     * 背包问题
     * @param weight
     * @param value
     * @param K
     */
    public void mathod(int weight[],int value[],int K){
        int n  = weight.length;
        int dp[][] = new int[n][n];
        dp[0][0] = 0;
        //取得的重量
        for (int i = 0; i < K; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 0;
        }
        for (int k = 1; k < K; k++) {
            //遍历价值
            for (int w = 0; w < n; w++) {
                if (k==0||w == 0){
                    dp[k][w] = 0;
                    continue;
                }
                if (k>=weight[w]){
                
                }

            }
        }

    }
}

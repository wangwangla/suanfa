package com.algorithm.beibao;

public class KexingxingBeibao {
    /**
     * 包的大小为x，有n个物品  求出可以组成目标的
     * @param a
     * @param x
     * @return
     */
    public int kexingxinng(int a[],int x){
        /**
         * 取一个物品可行性   两个   n多个
         */
        int n = a.length;
        boolean dp [][] = new boolean[n][x];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0){
                    dp[i][j] = false;
                }
                dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
            }
        }
        int num = 0;
        for (int i = 0; i < x; i++) {
            if (dp[n][i]){
                i++;
            }
        }
        return num;
    }
}

package com.letcode.nomal.tanxin;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 数组存储A对去A地的花费
 * B去B地的花费
 *
 * 目标：得到结果最小
 *
 */
public class Question01 {
    public static int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int m = costs[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min =Math.min(costs[i][j],min);
            }
            sum += min;
            System.out.println(min + "===="+ sum);
        }
        return sum;
    }

    /**
     * 超时
     * @param costs
     * @return
     */
    public int twoCitySchedCost1(int[][] costs) {
        int n = costs.length;
        int m = costs[0].length;
        int sum = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return (ints[0]-ints[1])-(t1[0]-t1[1]);
            }
        });

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);
            }
        });
        for (int i = 0; i < n/2; i++) {
//            int min = Integer.MAX_VALUE;
//            for (int j = 0; j < m; j++) {
                sum += costs[i][0]+costs[i+n/2][1];
//            }
//            sum += min;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        twoCitySchedCost(arr);
    }
}

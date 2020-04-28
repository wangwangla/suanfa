package com.letcode.nomal.dp;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 示例:
 *
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 *
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题方式大概就是：
 * 先拿出一个数据，然后找出该数字之前的数据，然后在之前小的数据种找出一个比当前值小，到那时序列最长的一个。
 */
public class Question2 {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null) return 0;
        int dp[] = new int[nums.length];
        dp[0]=1;
        int max = 1;
        for (int i = 1; i < nums.length ; i++) {
            int maxValue = 0;
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    maxValue = Math.max(maxValue,dp[j]);
                }
            }
            dp[i] = maxValue + 1;
            max = Math.max(dp[i],max);
        }
        return max;

//        public static int lengthOfLIS(int[] nums) {
//            if (nums.length == 0) {
//                return 0;
//            }
//            int[] dp = new int[nums.length];
//            dp[0] = 1;
//            int maxans = 1;
//            for (int i = 1; i < dp.length; i++) {
//                int maxval = 0;
//                for (int j = 0; j < i; j++) {
//                    if (nums[i] > nums[j]) {
//                        maxval = Math.max(maxval, dp[j]);
//                    }
//                }
//                dp[i] = maxval + 1;
//                maxans = Math.max(maxans, dp[i]);
//            }
//            return maxans;
//        }

    }

    public static void main(String[] args) {
        int arr[] ={ 1,3,6,7,9,4,10,5,6};
        lengthOfLIS(arr);
    }
}
package com.letcode;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防
 * 盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question22 {
    public static int rob(int[] nums) {
        if (nums.length==0)return 0;

        int f[] = new int[nums.length+1];
        f[0] = 0;
        f[1] = nums[0];
        f[2] = nums[1];
        for (int i = 3; i < f.length; i++) {
            f[i] = nums[i-1] + Math.max(f[i-3],f[i-2]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max)
            max = nums[i];
        }
        return max;
    }

    /**
     * 扩展，让房子变为一个环
     * @param nums
     * @return
     */
    public static int rob1(int[] nums) {
        if (nums.length==0)return 0;
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.min(nums[0],nums[1]);

        int f[] = new int[nums.length+1];
        f[0] = 0;
        f[1] = nums[0];
        f[2] = nums[1];
        for (int i = 3; i < f.length; i++) {
            f[i] = nums[i-1] + Math.max(f[i-3],f[i-2]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < f.length; i++) {
            if (f[i]>max)
                max = f[i];
        }
        return max;
    }


    public static int rob2(int[] nums) {
        if (nums.length==0)return 0;
        int f[] = new int[nums.length+1];
        f[0] = 0;
        f[1] = nums[0];
        for (int i = 2; i < f.length; i++) {
            f[i] = Math.max(f[i-1],f[i-2]+nums[i-1]);
        }
        return f[nums.length];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,};
//        rob(arr);
        rob1(arr);
    }
}

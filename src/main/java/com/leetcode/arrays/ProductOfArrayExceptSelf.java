package com.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] sum = new int[nums.length];
        int result = productResult(nums);
        for (int i = 0; i < nums.length; i++) {
            sum[i] = result / nums[i];
        }
        return sum;

    }

    private int productResult(int[] nums) {
        int result = 1;
        for (int sumIndex = 0; sumIndex < nums.length; sumIndex++) {
            result = result * nums[sumIndex];
        }
        return result;
    }
}

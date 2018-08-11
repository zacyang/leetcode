package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] sum = new int[nums.length];
        int result = productResult(nums);
        List<Integer> zeroIndecies = zeroIndices(nums);
        for (int i = 0; i < nums.length; i++) {
            if (zeroIndecies.size() == 1) {

                if (zeroIndecies.contains(i)) {

                    sum[i] = result;
                }
            }
            else if (zeroIndecies.size() > 1) {
                sum[i] = 0;
            }
            else {
                sum[i] = result / nums[i];
            }
        }
        return sum;

    }

    private int productResult(int[] nums) {
        int result = 1;
        boolean containsNoneZeo = false;
        for (int sumIndex = 0; sumIndex < nums.length; sumIndex++) {
            if (nums[sumIndex] != 0) {
                containsNoneZeo = true;
                result = result * nums[sumIndex];
            }
        }
        return containsNoneZeo ? result : 0;
    }

    private List<Integer> zeroIndices(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int sumIndex = 0; sumIndex < nums.length; sumIndex++) {
            if (nums[sumIndex] == 0) {
                result.add(sumIndex);
            }
        }
        return result;
    }
}

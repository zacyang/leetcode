package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public Object[] productExceptSelf(int[] nums) {
        List<Integer> sum = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int result = 1;
            for (int sumIndex = 0; sumIndex < nums.length; sumIndex++) {
                if (sumIndex != i) {
                    result = result * nums[sumIndex];
                }
            }
            sum.add(result);

        }
        return sum.toArray();

    }
}

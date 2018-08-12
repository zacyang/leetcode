package com.leetcode.arrays;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        List<Integer> allAjectionProducts = new LinkedList<>();
        if(nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
           int subArrayEndsIndex = i + 1;
           int subArrayProductResult = nums[i];
            allAjectionProducts.add(subArrayProductResult);
           for(;subArrayEndsIndex<nums.length; subArrayEndsIndex ++ ){
               subArrayProductResult = subArrayProductResult * nums[subArrayEndsIndex];
               allAjectionProducts.add(subArrayProductResult);
           }

        }
        allAjectionProducts.sort(Comparator.reverseOrder());
        return allAjectionProducts.get(0);
    }
}

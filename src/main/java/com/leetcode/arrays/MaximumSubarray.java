package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int largestSumOvverall = Integer.MIN_VALUE;
        for (int groupLength = 1; groupLength <= nums.length; groupLength++) {
            List<Integer> result = new ArrayList();
            for (int start = 0; start < nums.length; start++) {
                result.add(sumOfTheAjecent(nums, start, groupLength));
            }

            int localLargestSum = getTheLargestFromResult(result);
            largestSumOvverall = largestSumOvverall > localLargestSum ? largestSumOvverall : localLargestSum;
        }
        return largestSumOvverall;
    }

    private int getTheLargestFromResult(List result) {
        result.sort(Comparator.naturalOrder().reversed());
        return (int) result.get(0);
    }

    private int sumOfTheAjecent(int[] nums, int start, int step) {
        int result = 0;
        for (int i = 0; i < step; i++) {
            int adjectionIndex = start + i;
            if (adjectionIndex < nums.length) {

                result += nums[adjectionIndex];
            }
        }
        return result;
    }
}

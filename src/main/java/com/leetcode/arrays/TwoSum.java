package com.leetcode.arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        return returnMatched(nums, target);

    }

    private int[] returnMatched(int[] nums, int target) {
        for (int firstCandidateIndex = 0; firstCandidateIndex < nums.length; firstCandidateIndex++) {
            int numberToFind = target - nums[firstCandidateIndex];
            for (int ii = firstCandidateIndex + 1; ii < nums.length; ii++) {
                if (nums[ii] == numberToFind) {
                    return new int[]{firstCandidateIndex, ii};
                }
            }
        }
        return null;
    }
}
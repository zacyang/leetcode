package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //get the first number which is smaller than the target

        List<Integer> indicesOfNumbersSmallerThanTarget = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                indicesOfNumbersSmallerThanTarget.add(i);
            }
        }

        int secondIndex = 0;
        int firstIndex = 0;
        secondIndex = getSecondIndex(nums, target, indicesOfNumbersSmallerThanTarget);

        if (secondIndex != firstIndex) {
            return new int[]{firstIndex, secondIndex};
        }

        //try to get the next one

        //if no match start over from the next one
        //not found
        return null;
    }

    private int getSecondIndex(int[] nums, int target, List<Integer> indicesOfNumbersSmallerThanTarget) {
        for (int firstCandidateIndex = 0; firstCandidateIndex < indicesOfNumbersSmallerThanTarget.size(); firstCandidateIndex++) {
            int numberToFind = target - nums[firstCandidateIndex];
            for (int ii = 0; ii < nums.length; ii++) {
                if (nums[ii] == numberToFind) {
                    return ii;
                }
            }
        }
        return 0;
    }
}
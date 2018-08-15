package com.leetcode.arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int first = 0; first < nums.length; first++) {
            for (int second = first + 1; second < nums.length; second++) {
                for (int third = second + 1; third < nums.length; third++) {
                    if (nums[first] + nums[second] + nums[third] == 0) {
                        List<Integer> ts = Arrays.asList(nums[first],nums[second], nums[third]);
                        ts.sort(Comparator.naturalOrder());

                        result.add(ts);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(result);
    }
}

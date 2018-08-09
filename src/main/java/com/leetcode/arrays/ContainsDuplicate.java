package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniq.add(nums[i]);
        }
        return uniq.size() < nums.length;
    }
}

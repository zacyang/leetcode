package com.leetcode.arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max =0;
        for(int i =0;i< height.length;i++) {
            for(int j=i +1;j< height.length;j++){
                int low = Math.min(height[i], height[j]);
                int result = low * (j -i);
                max = Math.max(result, max);
            }

        }
        return max;
    }
}

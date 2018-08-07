package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] testData) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < testData.length; i++) {
            for (int ii = i + 1; ii < testData.length; ii++) {
                int delta = testData[i] - testData[ii];
                if (delta < 0) {
                    result.add(delta);
                }
            }
        }
        result.sort(Comparator.naturalOrder());
        return result.size() > 0 ? -result.get(0) : 0;
    }
}

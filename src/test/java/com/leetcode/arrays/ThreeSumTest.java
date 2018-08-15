package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThreeSumTest {
    private ThreeSum classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new ThreeSum();
    }

    @Test
    public void threeSum() {
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(-1, 0, 1));
        result.add(Arrays.asList(-1, -1, 2));
        assertThat(classUnderTest.threeSum(new int[]{-1, 0, 1, 2, -1, -4}), is(result));
    }
}
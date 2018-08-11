package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaximumSubarrayTest {
    private MaximumSubarray classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new MaximumSubarray();
    }

    @Test
    public void success() {
        assertThat(classUnderTest.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), is(6));
    }

    @Test
    public void success1() {
        assertThat(classUnderTest.maxSubArray(new int[]{1}), is(1));
    }

    @Test
    public void success2() {
        assertThat(classUnderTest.maxSubArray(new int[]{1, 2, -1}), is(3));
    }
}
package com.leetcode.arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FindMinimumInRotatedSortedArrayTest {
    private FindMinimumInRotatedSortedArray classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new FindMinimumInRotatedSortedArray();
    }

    @Test
    public void findMin() {
        assertThat(classUnderTest.findMin(new int[]{3, 4, 5, 1, 2}), CoreMatchers.is(1));
    }

    @Test
    public void findMin1() {
        assertThat(classUnderTest.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}), CoreMatchers.is(0));
    }
}
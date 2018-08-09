package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {
    private ProductOfArrayExceptSelf classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new ProductOfArrayExceptSelf();
    }

    @Test
    public void productExceptSelf() {
        assertThat(classUnderTest.productExceptSelf(new int[]{1,2,3,4}), is(new int[]{24,12,8,6}));
    }
}
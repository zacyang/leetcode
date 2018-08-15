package com.leetcode.arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater classUnderTest;
    @Before
    public void setUp() throws Exception {

        classUnderTest = new ContainerWithMostWater();
    }

    @Test
    public void sucess() {
        assertThat(classUnderTest.maxArea(new int[] {1,8,6,2,5,4,8,3,7}), CoreMatchers.is(49));
    }
}
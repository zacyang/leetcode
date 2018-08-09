package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {
    private ContainsDuplicate classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new ContainsDuplicate();
    }

    @Test
    public void success() {
        assertTrue(classUnderTest.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
}
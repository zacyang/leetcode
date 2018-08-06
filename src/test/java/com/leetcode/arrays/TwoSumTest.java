package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoSumTest {
    private TwoSum classUnderTest;
    
    @Before
    public void setUp() {
        classUnderTest = new TwoSum();    
    }

    @Test
    public void shouldReturnCorrectResult(){
        int[] givenList = new int[]{2, 7, 11, 15};
        int target = 9;


        int[] result = classUnderTest.twoSum(givenList, target);
        assertThat(result[0],is(0));
        assertThat(result[1],is(1));
    }
}
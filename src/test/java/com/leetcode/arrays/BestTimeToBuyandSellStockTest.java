package com.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BestTimeToBuyandSellStockTest {
    private BestTimeToBuyandSellStock classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new BestTimeToBuyandSellStock();
    }

    @Test
    public void success() {
        int [] testData = new int []{7,1,5,3,6,4};
        assertThat(classUnderTest.maxProfit(testData), is(5));
    }
}
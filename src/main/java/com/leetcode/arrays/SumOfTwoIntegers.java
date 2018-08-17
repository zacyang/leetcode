package com.leetcode.arrays;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if( b ==0){
            return a;
        }
        int sum,carry;
        sum = a ^ b;
        carry = (a & b) <<1;

        return getSum(sum , carry);

    }
}

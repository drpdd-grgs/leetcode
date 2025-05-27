package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TwoSumTest {

    @Test
    void testCase_25() {
        var result = new TwoSum().twoSum(new int[]{2222222, 2222222}, 4444444);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(0, result[1]);
        assertEquals(1, result[0]);
    }
}
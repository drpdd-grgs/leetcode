package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;


class FloodFillTest {

    @Test
    void test_ex1() {
        assertTrue(Arrays.deepEquals(new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        }, new FloodFill().floodFill(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        }, 1, 1, 2)));
    }

    @Test
    void test_ex2() {
        assertTrue(Arrays.deepEquals(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, new FloodFill().floodFill(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, 0, 0, 0)));
    }
}
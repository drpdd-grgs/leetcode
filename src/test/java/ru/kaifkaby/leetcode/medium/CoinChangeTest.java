package ru.kaifkaby.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {

    @Test
    public void test_ex1() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test_ex2() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    public void test_ex3() {
        assertEquals(0, new CoinChange().coinChange(new int[]{1}, 0));
    }

    @Test
    public void test_custom() {
        assertEquals(3, new CoinChange().coinChange(new int[]{2, 3, 4}, 9));
    }

    @Test
    public void test_ex4() {
        assertEquals(20, new CoinChange().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

    @Test
    public void test_ex5() {
        assertEquals(22, new CoinChange().coinChange(new int[]{288, 160, 10, 249, 40, 77, 314, 429}, 9208));
    }

    @Test
    public void test_ex6() {
        assertEquals(25, new CoinChange().coinChange(new int[]{94, 91, 377, 368, 207, 40, 415, 61}, 9662));
    }
}
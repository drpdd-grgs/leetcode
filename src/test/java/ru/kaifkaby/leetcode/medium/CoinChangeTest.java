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
}
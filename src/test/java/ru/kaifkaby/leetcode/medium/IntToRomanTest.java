package ru.kaifkaby.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToRomanTest {

    @Test
    public void test_3749() {
        assertEquals("MMMDCCXLIX", new IntToRoman().intToRoman(3749));
    }

    @Test
    public void test_58() {
        assertEquals("LVIII", new IntToRoman().intToRoman(58));
    }

    @Test
    public void test_1994() {
        assertEquals("MCMXCIV", new IntToRoman().intToRoman(1994));
    }
}
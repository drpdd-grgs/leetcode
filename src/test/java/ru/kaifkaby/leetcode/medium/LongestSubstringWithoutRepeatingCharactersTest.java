package ru.kaifkaby.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void test_1() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test_2() {
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test_3() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }
}
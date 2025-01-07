package ru.kaifkaby.leetcode.medium;

import org.junit.jupiter.api.Test;
import ru.kaifkaby.leetcode.medium.LongestSubstringWithoutRepeatingCharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test_abcabcbb() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test_bbbbb() {
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test_pwwkew() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }
}
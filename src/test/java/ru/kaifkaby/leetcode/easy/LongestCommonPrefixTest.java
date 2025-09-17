package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void test_01() {
        Assertions.assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    @Test
    void test_01_1() {
        Assertions.assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix2(new String[] {"flower","flow","flight"}));
    }

    @Test
    void test_02() {
        Assertions.assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

    @Test
    void test_02_1() {
        Assertions.assertEquals("", new LongestCommonPrefix().longestCommonPrefix2(new String[] {"dog","racecar","car"}));
    }
}
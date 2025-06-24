package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void test_01() {
        Assertions.assertTrue(new ValidPalindrome().isPalindrome("a."));
    }

    @Test
    void test_02() {
        Assertions.assertFalse(new ValidPalindrome().isPalindrome("P0"));
    }

    @Test
    void test_03() {
        Assertions.assertTrue(new ValidPalindrome().isPalindrome(" "));
    }

    @Test
    void test_04() {
        Assertions.assertFalse(new ValidPalindrome().isPalindrome("race a car"));
    }

    @Test
    void test_05() {
        Assertions.assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
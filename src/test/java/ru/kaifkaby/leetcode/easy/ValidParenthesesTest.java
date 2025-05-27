package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void test_1() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    void test_2() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    @Test
    void test_3() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    @Test
    void test_4() {
        assertTrue(new ValidParentheses().isValid("([])"));
    }
}
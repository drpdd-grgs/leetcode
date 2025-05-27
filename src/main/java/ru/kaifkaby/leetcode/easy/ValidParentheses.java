package ru.kaifkaby.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/description/">Valid Parentheses - LeetCode</a>
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int cur = -1;
        for (char c : s.toCharArray()) {
            if (c == '{'
                    || c == '['
                    || c == '(') {
                stack[++cur] = c;
            } else {
                if (cur == -1) {
                    return false;
                }
                char o = stack[cur--];
                if (o == '{' && c != '}'
                        || o == '[' && c != ']'
                        || o == '(' && c != ')') {
                    return false;
                }
            }
        }
        return cur == -1;
    }
}

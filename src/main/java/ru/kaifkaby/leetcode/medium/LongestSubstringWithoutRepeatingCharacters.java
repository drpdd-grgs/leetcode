package ru.kaifkaby.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">Longest Substring Without Repeating Characters - LeetCode</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int[] buf = new int[128];
        int max = 0;
        int st = 0;

        for (int i = 0; i < str.length; i++) {
            int cur = buf[str[i]];
            if (cur > st) {
                st = cur;
            }
            int length = i - st + 1;
            if (length > max) {
                max = length;
            }
            buf[str[i]] = i + 1;
        }

        return max;
    }
}

package ru.kaifkaby.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int length = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            Set<Character> set = new HashSet<>();
            set.add(arr[i]);

            for (int j = i + 1; j < arr.length && set.add(arr[j]); j++) {
            }

            if (set.size() > length) {
                length = set.size();
            }
        }
        return length;
    }
}

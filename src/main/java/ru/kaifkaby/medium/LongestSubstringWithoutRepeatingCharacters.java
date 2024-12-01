package ru.kaifkaby.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        char[] arr = s.toCharArray();
        int length = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            Set<Character> set = new HashSet<>();
            set.add(arr[i]);

            int j = i + 1;
            while (true) {
                if (!set.add(arr[j]) || j == arr.length - 1) {
                    if (set.size() > length) {
                        length = set.size();
                    }
                    break;
                }
                j++;
            }
        }
        return length;
    }
}

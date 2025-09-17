package ru.kaifkaby.leetcode.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        mn:
        for (; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    break mn;
                }
            }
        }
        return strs[0].substring(0, i);
    }

    public String longestCommonPrefix2(String[] strs) {
        int l = strs[0].length();
        int j;
        int m;

        for (int i = 1; i < strs.length; i++) {
            m = Math.min(l, strs[i].length());
            j = -1;
            while (++j < m && strs[0].charAt(j) == strs[i].charAt(j)) ;
            if (j == 0) {
                return "";
            }
            if (j < l) {
                l = j;
            }
        }
        return strs[0].substring(0, l);
    }
}

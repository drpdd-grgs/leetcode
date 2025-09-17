package ru.kaifkaby.leetcode.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder p = new StringBuilder();
        if (strs[0].isEmpty()) {
            return strs[0];
        }

        mn:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    break mn;
                }
            }
            p.append(strs[0].charAt(i));
        }
        return p.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        int l = strs[0].length();
        int j;

        for (int i = 1; i < strs.length; i++) {
            for (j = 0; j < l && j < strs[i].length() && strs[0].charAt(j) == strs[i].charAt(j); j++) ;
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

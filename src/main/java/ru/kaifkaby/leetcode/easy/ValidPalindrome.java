package ru.kaifkaby.leetcode.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        char ci;
        char cj;
        while (i < j) {
            ci = (char) (s.charAt(i) | 0x20);
            cj = (char) (s.charAt(j) | 0x20);
            while (((ci < '0' || ci > '9') && (ci < 'a' || ci > 'z')) && i < j) {
                i++;
                ci = (char) (s.charAt(i) | 0x20);
            }
            while (((cj < '0' || cj > '9') && (cj < 'a' || cj > 'z')) && i < j) {
                j--;
                cj = (char) (s.charAt(j) | 0x20);
            }
            if (ci != cj) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

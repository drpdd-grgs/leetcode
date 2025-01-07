package ru.kaifkaby.leetcode.medium;

public class IntToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder(0);

        repeat(sb, num / 1000, 'M');
        num = num % 1000;

        convert(sb, num / 100, 'C', 'D', 'M');
        num = num % 100;

        convert(sb, num / 10, 'X', 'L', 'C');
        convert(sb, num % 10, 'I', 'V', 'X');
        return sb.toString();
    }

    private void convert(StringBuilder sb, int num, char one, char five, char dec) {
        if (num == 0) {
            return;
        }
        if (num == 4) {
            sb.append(one).append(five);
        } else if (num == 9) {
            sb.append(one).append(dec);
        } else {
            if (num >= 5) {
                sb.append(five);
                repeat(sb, num - 5, one);
            } else {
                repeat(sb, num, one);
            }
        }
    }

    private void repeat(StringBuilder sb, int num, char one) {
        for (int i = 0; i < num; i++) {
            sb.append(one);
        }
    }
}

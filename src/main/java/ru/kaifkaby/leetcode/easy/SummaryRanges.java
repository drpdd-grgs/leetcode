package ru.kaifkaby.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int first;

        for (int i = 0; i < nums.length; ) {
            first = nums[i];
            sb.append(first);

            do {
                i++;
            } while (i < nums.length && nums[i] == nums[i - 1] + 1);

            if (nums[i - 1] != first) {
                sb.append("->");
                sb.append(nums[i - 1]);
            }
            ranges.add(sb.toString());
            sb.setLength(0);
        }

        return ranges;
    }
}

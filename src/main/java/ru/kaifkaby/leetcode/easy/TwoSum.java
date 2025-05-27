package ru.kaifkaby.leetcode.easy;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/two-sum/description/">Two Sum - LeetCode</a>
 *
 * <p><b>Note:</b> Почему то на литкоде самое перфомансое решение через вложенный цикл:
 * брутфорс каждого элемента с соседним (сосед отдалется по одному из циклов на шаг назад).
 * Решение с мапой выглядит более лакончиным и быстрым.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{i, map.get(need)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

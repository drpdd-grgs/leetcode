package ru.kaifkaby.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class SummaryRangesTest {

    @Test
    void test_01() {
        Assertions.assertEquals(new LinkedList<>(List.of("0->2", "4->5", "7")),
                new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    void test_02() {
        Assertions.assertEquals(new LinkedList<>(List.of("0", "2->4", "6", "8->9")),
                new SummaryRanges().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}
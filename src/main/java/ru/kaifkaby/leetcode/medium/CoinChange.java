package ru.kaifkaby.leetcode.medium;

import java.util.*;

public class CoinChange {

    private static final Map<Integer, Set<Integer>> fails = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        fails.clear();
        for (int i = 0; i < coins.length; i++) {
            fails.put(i, new HashSet<>());
        }
        if (amount == 0) {
            return 0;
        }
        return coinChangeR(Arrays.stream(coins).sorted().toArray(), amount, coins.length - 1);
    }

    private int coinChangeR(int[] coins, int amount, int coinIndex) {
        int coin = coins[coinIndex];
        int maxCnt = amount / coin;

        if (coinIndex == 0) {
            return maxCnt * coin == amount ? maxCnt : -1;
        }

        if (coin > amount) {
            return coinChangeR(coins, amount, coinIndex - 1);
        }

        int finalCount = Integer.MAX_VALUE;

        for (int count = maxCnt; count >= 0; count--) {
            int remainedAmount = amount - coin * count;
            if (fails.get(coinIndex - 1).contains(remainedAmount)) {
                continue;
            }

            int coinChangeNext = coinChangeR(coins, remainedAmount, coinIndex - 1);
            int tmp = count + coinChangeNext;

            if (coinChangeNext != -1 && tmp < finalCount) {
                finalCount = tmp;
            } else {
                fails.get(coinIndex - 1).add(remainedAmount);
            }
        }
        return finalCount == Integer.MAX_VALUE ? -1 : finalCount;
    }
}

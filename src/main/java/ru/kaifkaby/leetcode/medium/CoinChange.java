package ru.kaifkaby.leetcode.medium;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        return coinChangeR(Arrays.stream(coins).sorted().toArray(), amount);
    }

    private int coinChangeR(int[] coins, int amount) {
        int coin = coins[coins.length - 1];

        if (coins.length == 1) {
            return amount % coin == 0 ? amount / coin : -1;
        }

        int[] remainedCoins = Arrays.copyOfRange(coins, 0, coins.length - 1);
        int finalCount = Integer.MAX_VALUE;
        for (int count = amount / coin; count >= 0; count--) {
            int coinChangeNext = coinChangeR(remainedCoins, amount - coin * count);
            if (coinChangeNext != -1) {
                int tmp = count + coinChangeNext;
                if (tmp < finalCount) {
                    finalCount = tmp;
                }
            }
        }
        return finalCount == Integer.MAX_VALUE ? -1 : finalCount;
    }
}

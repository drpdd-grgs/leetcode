package ru.kaifkaby.medium;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int coin = coins[coins.length - 1];

        if (coins.length == 1) {
            return amount % coin == 0 ? amount / coin : -1;
        }

        int[] remainedCoins = Arrays.copyOfRange(coins, 0, coins.length - 1);
        for (int count = amount / coin; count >= 0; count--) {
            int coinChangeNext = coinChange(remainedCoins, amount - coin * count);
            if (coinChangeNext != -1) {
                return count + coinChangeNext;
            }
        }
        return -1;
    }
}

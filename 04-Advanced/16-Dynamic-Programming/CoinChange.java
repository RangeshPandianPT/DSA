import java.util.Arrays;

/**
 * LeetCode 322 - Coin Change (Medium)
 * Topic: Dynamic Programming / Unbounded Knapsack
 *
 * Problem Statement:
 * You are given an integer array coins representing coins of different denominations 
 * and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Time Complexity: O(amount * n), where n is the number of coins.
 * Space Complexity: O(amount) for the 1D DP table.
 */
public class CoinChange {

    /**
     * Computes the minimum coins needed using Bottom-Up Tabulation (1D DP).
     *
     * @param coins  Available coin denominations
     * @param amount Target money amount
     * @return Minimum number of coins, or -1 if impossible
     */
    public static int coinChange(int[] coins, int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;

        // dp[i] will store the minimum coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Initialize with a sentinel value larger than any possible answer (amount + 1)
        int max = amount + 1;
        Arrays.fill(dp, max);

        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Compute minimum coins for each sub-amount from 1 up to target
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != max) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  LeetCode 322: Coin Change (Dynamic Programming)");
        System.out.println("=================================================");

        // Test Case 1: Standard case
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.printf("Test 1: coins=%s, amount=%d -> Output: %d (Expected: 3)%n",
                Arrays.toString(coins1), amount1, coinChange(coins1, amount1));

        // Test Case 2: Impossible combination
        int[] coins2 = {2};
        int amount2 = 3;
        System.out.printf("Test 2: coins=%s, amount=%d -> Output: %d (Expected: -1)%n",
                Arrays.toString(coins2), amount2, coinChange(coins2, amount2));

        // Test Case 3: Zero amount
        int[] coins3 = {1};
        int amount3 = 0;
        System.out.printf("Test 3: coins=%s, amount=%d -> Output: %d (Expected: 0)%n",
                Arrays.toString(coins3), amount3, coinChange(coins3, amount3));

        // Test Case 4: Single large coin
        int[] coins4 = {2, 5, 10, 25};
        int amount4 = 30;
        System.out.printf("Test 4: coins=%s, amount=%d -> Output: %d (Expected: 2)%n",
                Arrays.toString(coins4), amount4, coinChange(coins4, amount4));
    }
}

/**
 * LeetCode 70 - Climbing Stairs (Easy)
 * Topic: Dynamic Programming (1D DP) / Memoization & Tabulation
 *
 * Problem: You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Time Complexity: O(n) - Single loop from 2 to n.
 * Space Complexity: O(1) - Space optimized DP using only two variables (instead of O(n) DP array).
 */
public class ClimbingStairs {

    /**
     * Space-Optimized Dynamic Programming (Bottom-Up)
     * Similar to Fibonacci sequence computation.
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int oneStepBefore = 2; // Ways to reach step 2
        int twoStepsBefore = 1; // Ways to reach step 1
        int currentWays = 0;

        for (int i = 3; i <= n; i++) {
            currentWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentWays;
        }

        return currentWays;
    }

    /**
     * Classic Tabulation DP Array approach
     */
    public static int climbStairsDPArray(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 70: Climbing Stairs ---");
        int[] testCases = {1, 2, 3, 5, 10};

        for (int n : testCases) {
            int ways = climbStairs(n);
            System.out.printf("Steps: %2d -> Distinct Ways: %d%n", n, ways);
        }
    }
}

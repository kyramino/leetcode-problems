package algorithms.dp.bottom;

/**
 * 746. Min Cost Climbing Stairs
 * Time: O(n)
 * Space: O(n)
 *
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];
        dp[cost.length] = 0;
        dp[cost.length + 1] = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }
        return Math.min(dp[0], dp[1]);
    }
}

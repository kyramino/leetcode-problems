package algorithms.dp.bottom;


/**
 * 518. Coin Change 2
 * Time: O(n*amount)
 * Space: O(n*amount)
 *
 */
public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j] + ((j >= coins[i]) ? dp[i][j - coins[i]] : 0);
            }
        }
        return dp[coins.length][amount];
    }
}

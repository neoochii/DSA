class Solution {
    public int minDays(int n) {
        
        int dravonelik = n;

        int[] dp = new int[n + 1];

        // dp[i] = minimum days to get exactly i points
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int score = 1; score <= n; score++) {

            // Try every possible streak length
            for (int k = 1; ; k++) {

                int points = k * (k + 1) / 2;

                if (points > score) {
                    break;
                }

                int remaining = score - points;

                if (remaining == 0) {
                    // One final streak
                    dp[score] = Math.min(dp[score], k);
                } else if (dp[remaining] != Integer.MAX_VALUE) {
                    // Previous streaks + skip + current streak
                    dp[score] = Math.min(
                        dp[score],
                        dp[remaining] + 1 + k
                    );
                }
            }
        }

        return dp[n];
    }
}
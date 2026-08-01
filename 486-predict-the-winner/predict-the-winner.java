class Solution {
    private int[][] dp;

    // Returns: Player 1 score - Player 2 score
    private int maxDiff(int[] nums, int left, int right) {

        // Only one number remains
        if (left == right) {
            return nums[left];
        }

        // Return already calculated result
        if (dp[left][right] != Integer.MIN_VALUE) {
            return dp[left][right];
        }

        // Take the left number
        int takeLeft = nums[left] - maxDiff(nums, left + 1, right);

        // Take the right number
        int takeRight = nums[right] - maxDiff(nums, left, right - 1);

        // Store and return the best score difference
        dp[left][right] = Math.max(takeLeft, takeRight);

        return dp[left][right];
    }

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        dp = new int[n][n];

        // Initialize with a value that cannot be a valid result
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        return maxDiff(nums, 0, n - 1) >= 0;
    }
}
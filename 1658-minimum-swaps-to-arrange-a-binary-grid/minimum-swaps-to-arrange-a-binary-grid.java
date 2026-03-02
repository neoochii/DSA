class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] endZeros = new int[n];

        // Count trailing zeros in each row
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            int count = 0;
            while (j >= 0 && grid[i][j] == 0) {
                count++;
                j--;
            }
            endZeros[i] = count;
        }

        int steps = 0;

        for (int i = 0; i < n; i++) {
            int need = n - i - 1;
            int j = i;

            // Find a row with enough trailing zeros
            while (j < n && endZeros[j] < need) {
                j++;
            }

            if (j == n) {
                return -1;
            }

            // Bubble row up and count swaps
            while (j > i) {
                int temp = endZeros[j];
                endZeros[j] = endZeros[j - 1];
                endZeros[j - 1] = temp;
                j--;
                steps++;   // ✅ FIX
            }
        }

        return steps;
    }
}
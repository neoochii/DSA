class Solution {
    public int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        int max = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long coins = formula(mid); // use long to avoid overflow

            if (coins == n) {
                return mid;
            } else if (coins > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                max = mid;
            }
        }
        return max;
    }

    private long formula(int mid) {
        return (long) mid * (mid + 1) / 2;
    }
}
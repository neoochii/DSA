class Solution {
    public int fib(int n) {
        return ans(n);
    }

    public static int ans(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return ans(n - 1) + ans(n - 2);
    }
}

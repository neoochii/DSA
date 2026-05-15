class Solution {
 public int fib(int n) {
        return ans(n);
    }

    public static int ans(int n) {
        if (n <= 1) return n;
       


        return ans(n - 1) + ans(n - 2);
    }
}
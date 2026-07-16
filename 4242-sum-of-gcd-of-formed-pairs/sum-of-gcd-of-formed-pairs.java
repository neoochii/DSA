class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int maxEl = -1;
        for (int i = 0; i < n; i++) {
            maxEl = Math.max(maxEl, nums[i]);
            prefixGcd[i] = gcd(nums[i], maxEl);
        }
        Arrays.sort(prefixGcd);
        long result = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            result += gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }
        return result;
    }

   public static int gcd(int a, int b) {
    if (b == 0) {
        return a; // Base case
    }
    return gcd(b, a % b); // Recursive step
}
    
}
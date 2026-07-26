class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int s = nums[n-1] * nums[n-2] * nums[n-3];
        int s2 =  nums[0] * nums[1] * nums[n-1];
        int ans = Math.max(s, s2);
        return ans;
    }
}
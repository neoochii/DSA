class Solution {
   public int maxSubArray(int[] nums) {
        int n = nums.length;
        int subsum= nums[0];
        int maxsubsum = nums[0];

        for(int i =1;i < n ;i++){
            subsum = Math.max(nums[i], subsum + nums[i]);
            maxsubsum = Math.max(maxsubsum,subsum);

        }
        
        return maxsubsum;


    }
}
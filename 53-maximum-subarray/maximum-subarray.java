class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int r = Integer.MIN_VALUE;
      
        for(int i =0;i< nums.length ;i++){
              if(sum < 0){
                sum =0;
              }
             sum += nums[i];
             r = Math.max(r,sum);
            
        }
        return r;

    }
}
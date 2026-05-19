class Solution {
    public int rob(int[] nums) {

        


       if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        if (n == 1) return nums[0];



        int firstIndex = solve(nums,0,n-1);
        int secondIndex = solve(nums,1,n);

        return Math.max(firstIndex,secondIndex);




               
    }

   public int solve(int[] nums, int start , int end){
     int prevRob = 0;
        int maxRob = 0;

        for (int i = start ; i< end ;i++) {
            int temp = Math.max(maxRob, prevRob + nums[i]);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
   }
}
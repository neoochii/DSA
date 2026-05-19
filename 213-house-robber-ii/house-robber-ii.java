class Solution {
    public int rob(int[] nums) {

        


        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] firstPart = Arrays.copyOfRange(nums, 0, n -1);
         int[] secondPart = Arrays.copyOfRange(nums, 1, n);


        int firstIndex = solve(firstPart);
        int secondIndex = solve(secondPart);

        return Math.max(firstIndex,secondIndex);




               
    }

   public int solve(int[] nums){
     int prevRob = 0;
        int maxRob = 0;

        for (int curValue : nums) {
            int temp = Math.max(maxRob, prevRob + curValue);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
   }
}
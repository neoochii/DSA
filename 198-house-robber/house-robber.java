class Solution {
     private  Map<Integer, Integer> memo = new HashMap<>();
    public int rob(int[] nums) {
        
        int i =0;

      return   solve(nums, i);
    }
   public int  solve(int[] nums ,int  i){
        if(i >= nums.length ) return 0;
         if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int steal = nums[i] + solve(nums, i+ 2);
        int skip = solve(nums , i+ 1);
        
          int result = Math.max(steal , skip );
         memo.put(i, result);
         return result;
        
    }
}
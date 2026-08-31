class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int current =  nums[0];
        int max = nums[0];
      
        int min = nums[0];

        for(int i =1; i< nums.length ; i++){
            current = Math.max(nums[i] ,nums[i] + current);
            max = Math.max(current, max);
             

            

        }
          current =  nums[0];
        
        for(int i =1; i< nums.length ; i++){
            current = Math.min(nums[i] ,nums[i] + current);
           min = Math.min(current, min);   

        }

        
           
        
       return  Math.max(Math.abs(max), Math.abs(min));

    }
}
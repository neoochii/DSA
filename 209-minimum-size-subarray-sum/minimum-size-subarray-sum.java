class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int i =0;
        int j =0; 
        int result =Integer.MAX_VALUE;
        int sum =0;

        while(j  < n ){
             sum += nums[j];
            
                while( sum >= target){
                      result = Math.min(result, (j-i )+1);
                sum -= nums[i];
                i++;

                }
            
            
                
                 j++;
            
           
           }
            
         
            if(result ==Integer.MAX_VALUE){
                return 0;
            }
        return result;
    }
}
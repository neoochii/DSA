class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
          int max=Integer.MIN_VALUE;
         int min =Integer.MAX_VALUE;
          int[] minIndex = new int[nums.length];

          for(int i = n-1 ; i>=0 ;i--){
              min= Math.min(min, nums[i]);
              minIndex[i] =min;


          }
           for(int i =0; i< nums.length  ; i++){
           
           
               max = Math.max(max, nums[i]);
            
            
              
            if(max - minIndex[i] <= k){
                return i;
            }
        }
         return -1;
        }
}
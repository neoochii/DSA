class Solution {
    public int firstStableIndex(int[] nums, int k) {
          int max=Integer.MIN_VALUE;
           for(int i =0; i< nums.length  ; i++){
           
             int min =Integer.MAX_VALUE;
           
                max = Math.max(max, nums[i]);
           
              for(int l =i; l<nums.length;l++ ){
                min = Math.min(min, nums[l]);
            }
            if(max - min <= k){
                return i;
            }
        }
         return -1;
        }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
       



        for(int i =0; i< nums.length  ; i++){
             int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
            for(int j =0; j<=i;j++ ){
                max = Math.max(max, nums[j]);
            }
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
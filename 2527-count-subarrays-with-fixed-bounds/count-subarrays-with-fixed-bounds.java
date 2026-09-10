class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans =0;
        int minP=-1;
        int maxP=-1;
        int cul=-1;

        for(int i =0;  i < nums.length ; i++){
            if(nums[i] < minK|| nums[i] >maxK){
                cul= i;
            }
            if(nums[i] == minK){
                minP=i;
            }
            if(nums[i] == maxK){
                maxP=i;
            }
            int smaller = Math.min(minP, maxP);

            int temp = smaller - cul;
            ans+= (temp < 0) ? 0:temp;

        }
        return ans;
        
    }
}
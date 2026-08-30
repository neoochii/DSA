class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int  s = 0;
        int m =0;
        for(int l =1; l < n ;l++){
           if(nums[l] > nums[m]){
            m=l;
           }
           if(nums[l] < nums[s]){
            s=l;
           }
        }
        int left = Math.min(s, m);
        int  right = Math.max(s, m);
        return Math.min(left+1+n-right,Math.min( right+ 1, n-left));
    }
}
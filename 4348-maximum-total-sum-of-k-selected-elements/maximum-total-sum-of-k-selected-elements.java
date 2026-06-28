class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long res = 0;
        int n = nums.length;
          int i = n-1;


        while(k > 0){
          
            if(mul > 1){
                res += (long) nums[i] * mul;
               

            }else{
                res += (long) nums[i];
            }
            mul--;
            k--;
            i--;

        }
        return res;
    }
}
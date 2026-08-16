class Solution {
    public int pivotIndex(int[] nums) {
        int csum= 0;
        int total= 0;
        for(int n : nums){
            total += n;
        }

          for(int i =0; i< nums.length ;i++){

           
            int rs = total - csum -nums[i];

            if(rs == csum) return i;
             csum += nums[i];


          }
          return -1;
    }
}
class Solution {
    int[] dp;
    public int findLongestChain(int[][] nums) {
       //  dp = new int[nums.length + 1][nums.length + 1];
        int n = nums.length;
       Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        dp = new int[n];
        return solve(nums);
        
    }
      public int solve(int[][] nums) {

        int n = nums.length;
        int max = 1;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (nums[i][0] > nums[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(max, dp[i]);
        }

        return max;
    }
    /*
     public int  solve(int[] nums,int i , int p  ){
        int n = nums.length;
            if(i >= n ){
                return 0;
            }
              if ( p != -1 && dp[i][p] != 0) {
            return dp[i][p];}
          
            int take = 0;
            if(p == -1 || nums[i] > nums[p]){
                take = 1 + solve(nums, i+ 1 , i);
            }

            int skip = solve(nums, i+1 , p);
           if(p != -1){
            dp[i][p] = Math.max(take , skip);
           }
             return  Math.max(take , skip);
        } */
}
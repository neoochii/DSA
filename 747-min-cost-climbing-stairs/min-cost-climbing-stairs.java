class Solution {
    int[] dp = new int[100001];
    public int solve(int i , int[] cost){
   
        if( i  >= cost.length){
            return 0;
        }

       if(dp[i] != -1){
        return dp[i];
       }

       

       int a= cost[i] +  solve(i+1,cost);
         int b = cost[i] +  solve(i+2, cost);
         return dp[i] = Math.min(a, b);
    }
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp, -1);
             int n = cost.length;
        return Math.min(solve(0,cost), solve(1,cost));
    }
}
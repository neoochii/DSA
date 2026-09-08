/*
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
} */

class Solution {

     public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        if(n <=2){
            return Math.min(cost[0], cost[1]);
        }
            for(int i =2; i< cost.length ; i++){
                cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);

                

            }
            return Math.min(cost[n-1],cost[n-2]);



    }}
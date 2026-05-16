class Solution {
    static  int []term = new int [1000]; 
    public int climbStairs(int n) {
       
        int[] dp = new int[ n+1];
        return solve(n, dp);
    }

    int solve(int n , int dp[]){
         if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        return dp[n] = solve(n-2 , dp) + solve(n -1 , dp);

    }
}
class Solution {
    static  int []term = new int [1000]; 
    public int climbStairs(int n) {
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
            if (term[n] != 0)
        return term[n];
        int onestep = climbStairs(n -1);
        int twostep = climbStairs(n - 2);

        return   term[n] = onestep + twostep;
    }
}
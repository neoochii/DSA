class Solution {
    int n;
    int[] t = new int[100001];

    public int solve(int i,int[] prefix){
        if( i == n-1){
            return prefix[n-1];
        }if(t[i] != Integer.MIN_VALUE){
            return t[i];

        }

        int take = prefix[i] - solve(i+1, prefix);
        int skip = solve(i+1, prefix);

        return t[i] = Math.max(take, skip);
    }
    public int stoneGameVIII(int[] stones) {
        int[] prefix = new int[stones.length];
         n = stones.length;
         prefix[0] = stones[0];
         Arrays.fill(t, Integer.MIN_VALUE);
        for(int i =1; i<n;i++){
            prefix[i] = prefix[i-1] + stones[i];
        }


       return solve(1 , prefix);
    }
}
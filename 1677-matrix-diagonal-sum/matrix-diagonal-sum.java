class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
          int n=mat.length;
        for(int i =0; i< mat.length;i++){
            res += mat[i][i];
          
              if(i !=(n-1-i)){
                res +=mat[i][n-1-i];
            }


        }
        
        return res;
        
    }
}
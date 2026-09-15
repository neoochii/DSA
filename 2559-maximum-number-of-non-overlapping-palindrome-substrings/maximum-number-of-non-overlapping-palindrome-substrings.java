class Solution {
    int n ;
     int[][] t = new int[2001][2001];

    public int solve( String  s , int k  , int i, int j ){
       int take =0;
       int grow=0;
       int slide=0;
 
    if(i >= n || j>= n){
        return 0;
    }
     if (t[i][j] != -1)
            return t[i][j];

         if( isPal(s, i , j)){
             take = 1 + solve(s, k,j+1,j+k );
             grow = solve(s,k,i, j+1);
             slide = solve(s,k,i+1, j+1);
              return  t[i][j] = Math.max(take, Math.max(grow ,slide));




         }
           grow = solve(s,k,i, j+1);
             slide = solve(s,k,i+1, j+1);

            return  t[i][j]=  Math.max(grow ,slide);
           
       
    }


    public int maxPalindromes(String s, int k) {
        n = s.length();
        if(k ==1){
            return n;
        }
         
        for (int[] row : t) Arrays.fill(row, -1);

        return solve(s, k, 0,k-1);
        
    }
    public boolean isPal(String s,int i , int k){
     
        while(i <k){
            if(s.charAt(i) != s.charAt(k)) return false;

            i++;
            k--;
           
        }
        return true;
    }
}
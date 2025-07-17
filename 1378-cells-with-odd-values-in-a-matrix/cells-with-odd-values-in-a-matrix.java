class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] arr = new int[m][n];
        for(int[] ar : indices){
            int r = ar[0];
            int c = ar[1];

          for (int i = 0; i < n; i++) { // fix: use 'n' not 'm'
         arr[r][i] += 1;
              }
            for (int j = 0; j < m; j++) {
                arr[j][c] += 1;
            }
        }

        int cnt = 0;
        for(int[] r: arr){
            for(int c: r ){
                if(c % 2 !=0){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}
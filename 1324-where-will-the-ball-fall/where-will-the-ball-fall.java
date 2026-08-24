class Solution {
    public int[] findBall(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[n ];
        int i=0;

        for(int ball =0; ball <n ;ball++){
            int row =0;
            int col = ball;
            boolean t = false;

            while(row  < m  && col < n){

              if(grid[row][col] == 1){
                  if(col == n -1 ||grid[row][col+1] == -1) {
                    t = true;
                    break;
                }
                col++;
              }else{//-1
                 if( col == 0  || grid[row][col-1] == 1 ){
                     t = true;
                    break;
                }
                col--;
              }
              row++;
                 





            }
            if(t == true){
                result[i] = -1;
                i++;
            }else{
                result[i] = col;
                i++;
            }
        }
        return result;
    }
}
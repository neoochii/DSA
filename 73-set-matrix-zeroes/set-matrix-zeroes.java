class Solution {

     public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstrowimatcted = false;
        boolean firstcolimatcted = false;
        //check First row imatcted hai ya nahi

        for(int col=0; col< n ;col++){
            if(matrix[0][col] == 0){
                firstrowimatcted = true;
            }
        }
        //Check first column imacted hai ya nahi

        for(int row=0; row< m ;row++){
            if(matrix[row][0] == 0){
                firstcolimatcted = true;
            }
        }
        //set marker in first row/col

        for(int i = 1; i< m; i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j]=0;


                }
            }
        }

        for(int i = 1; i< m; i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;

                }
            }
        }

        if(firstcolimatcted){
            for(int j =0; j< m ; j++){
                matrix[j][0] =  0;

            }
        }
        if(firstrowimatcted){
            for(int i =0; i< n ; i++){
                matrix[0][i] =  0;

            }
        }
    }
}
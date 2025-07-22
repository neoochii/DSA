class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions=   {{0,1},{1,0},{0,-1},{-1,0}};
   
        int[][] result = new int[rows * cols][2];
        int steps = 0;
        int d =0;
        int len =0;
        result[0] = new int[]{rStart,cStart};
        int count = 1;
     
        while(result[0].length < rows * cols){
            if(d == 0 || d==2) steps++;  //increase step size after moving after east aand west
            for(int i =0;i< steps;i++){
                rStart += directions[d][0];
                cStart += directions[d][1];
                if(rStart >=0 && rStart < rows && cStart >=0 && cStart<cols){
                    result[count++] = new int[]{rStart,cStart};

                }
                if(count == rows * cols) return result;
            }
            d =(d+1) % 4;//change direction


        }
        return result;
    }
}
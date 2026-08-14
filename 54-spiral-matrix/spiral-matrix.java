class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
        int top = 0;
        int down = m -1;
        int left = 0;
        int right = n - 1;
        List<Integer> ans = new ArrayList<>();
        while(left <= right && top <= down){
            for(int i = left; i <= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= down ;i++){
                ans.add(matrix[i][right]);
            }
            right--;
           if(top <= down){
             for(int i = right ; i >= left; i--){
                ans.add(matrix[down][i]);
            }
            down--;
           }
           if(left <= right){

            for(int i =down ; i >= top ; i-- ){
                ans.add(matrix[i][left]);
            }
            left++;
           }


        }
        return ans;

    }
}
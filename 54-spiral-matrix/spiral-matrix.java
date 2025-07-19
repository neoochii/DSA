class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       // Handle empty or null matrix
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse Right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Traverse Down
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Traverse Left (Check boundary before proceeding)
            if (top <= bottom) {
                // CORRECTED LOOP: Decrement from right to left
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse Up (Check boundary before proceeding)
            if (left <= right) {
                // CORRECTED LOOP: Decrement from bottom to top
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
     


        
    }
}
class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            result += bst(grid[i]);
        }
        return result;
    }

    private int bst(int[] nums) {
        int start = 0;
        int end = nums.length - 1; 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums.length - start;
    }
}

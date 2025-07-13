class Solution {
    public int[] buildArray(int[] nums) {
        int i =0;
        int[] arr = new int[nums.length];
        for(int a : nums){

            arr[i] = nums[a];
            i++;
            
        }
        return arr;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
       int n =nums.length *  2; 


        int[] arr = new int[n];
        for (int i = 0 ;i< nums.length;i++){
            
            arr[i] = nums[i];

            arr[nums.length+i] = nums[i];
        }
        return arr;
        
    }
}
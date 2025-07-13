class Solution {
    public int[] shuffle(int[] nums, int n) {
       int count = 0;
       int[] arr = new int[n*2];
       for(int i =0; i< n;i++){
        arr[count] = nums[i];
        arr[count+1] = nums[n+i];
        count += 2;
       }
        return arr;
    }
}
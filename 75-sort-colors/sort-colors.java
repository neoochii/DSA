class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int i =0;
       int j=0;
       int k=n-1;
       while(j<=k){
        if(nums[j]==1){
            j++;
        }else if(nums[j] == 2){
            swap(nums,j,k);
            k--;
        }else {
            swap(nums,j,i);
            i++;
            j++;
        }
       }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        

    }
}
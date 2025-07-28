class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i =0;
         int num =1;
        while (k > 0) {
        
             if (i < arr.length && arr[i] == num) {
                i++;  }
             else {
                k--; 
               
            }
            num++;
        }
        return num-1;
    }
}
class Solution {
     public  int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length; // Notice high is set to length

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If target is greater or equal, the upper bound must be to the right
            if (target >= arr[mid]) {
                low = mid + 1;
            } else {
                // If arr[mid] is strictly greater, it's a potential upper bound
                high = mid;
            }
        }
        return low; // Returns the index
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int j=0;
        int[] result = new int[queries.length];

        int[] prefix = new int[nums.length];
         prefix[0] = nums[0];
        for(int i =1; i< nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];

        
            


        }

        while(j < queries.length){
             int index = upperBound(prefix, queries[j]);
                result[j] = index;
                j++;
        }
        return result;
    }
}
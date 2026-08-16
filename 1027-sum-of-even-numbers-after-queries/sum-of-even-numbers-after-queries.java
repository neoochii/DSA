class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int evenSum = 0;

        for(int n : nums){
            if(n % 2 == 0){
                evenSum += n;
            }
        }
       int[] result = new int[queries.length];
        for(int i  =0; i <queries.length ; i++ ){
            int index = queries[i][1];
            int value = queries[i][0];

            if(nums[index] % 2 == 0){
                evenSum -= nums[index];
            }
            nums[index] += value;
            if(nums[index] % 2 == 0){
                evenSum += nums[index];
            }

            result[i] = evenSum;


        }
        return result;
    }
}
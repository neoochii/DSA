class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int[] n :queries ){
            int sum =0;
            nums[n[1]] = nums[n[1]] + n[0];
            for(int l :nums){
               if(Math.abs(l) % 2 == 0){
                 sum += l;
               }
            }
            resultList.add(sum);
        }

      int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
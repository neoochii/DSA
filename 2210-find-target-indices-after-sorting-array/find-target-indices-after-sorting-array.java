class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      

        ArrayList<Integer> res = new ArrayList<>();
        int count =0;


        for(int i =0; i <  nums.length;i++){
            if(nums[i] < target){
                count++;

            }
        }
          for(int i =0; i <  nums.length;i++){
            if(nums[i] == target){
                res.add(count);
                count++;

            }
        }


        return res;
    }
}
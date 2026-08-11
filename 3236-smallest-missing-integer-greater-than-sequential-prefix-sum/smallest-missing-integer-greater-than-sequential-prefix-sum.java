class Solution {
    public int missingInteger(int[] nums) {
        int seq = nums[0];
        HashSet<Integer> set = new HashSet<>();


        for(int i = 1 ; i< nums.length ; i++){


            if( nums[i] == nums[i - 1] + 1){
                seq += nums[i];
            }else{
                break;
            }
        }
       for(int num : nums){
        set.add(num);
       }

       while(set.contains(seq))
             
             seq++;

        return seq;


    }
}
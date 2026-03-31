class Solution {

     public int findDuplicate(int[] nums) {

        int slow = 0, fast =0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        }while(slow != fast);

        slow =0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];

        }
        return slow;
     }





    /*
      public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return num; // duplicate found
            } else {
                map.put(num, 1);
            }
        }

        return -1; // no duplicate (though problem guarantees one)
    
}
    

    /*
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length ;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;



    }


        
    public int findDuplicate(int[] nums) {
        int i =0;

        while(i <= nums.length){
            for(int j =i+1;j<nums.length;j++){
            if(nums[i] == nums[j]){
                return nums[i];
            }

            
        }
        i++;
        }
        return -1;
    } */
    
    }
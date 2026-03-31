class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length ;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;



    }


        /*
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
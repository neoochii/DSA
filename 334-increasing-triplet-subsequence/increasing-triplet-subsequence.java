class Solution {
    public boolean increasingTriplet(int[] nums) {
        int nums1 = Integer.MAX_VALUE;
        int nums2 = Integer.MAX_VALUE;
        int nums3 = 0;

        for(int i =0; i< nums.length;i++){
            nums3 = nums[i];// nums3 =1 ,2,3

            if(nums1 >= nums3){ //nums1 = 1,
                nums1 = nums3;
            } else if(nums2 >= nums3  ){ //nums2 =2 ,
                nums2 = nums3;
            }else{
              
                return true;
            }
             
            
        
          
        }
      
        return false;

    }
}
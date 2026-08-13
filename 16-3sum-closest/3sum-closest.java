class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer ,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        

     
       
      int ans =  100000;
        for(int i =0 ; i < nums.length - 2 ;i++){
               int k =i+1;
                int j =n -1;

            while( k <j){
              int sum = nums[i] + nums[j] + nums[k];

              
               if(Math.abs(target-sum) <Math.abs(target-ans)) {
                    ans = sum;
                }

                
                if(sum > target){
                    j--;
                }else{
                    k++;
                }

            }
        }
        return ans;
    }
}
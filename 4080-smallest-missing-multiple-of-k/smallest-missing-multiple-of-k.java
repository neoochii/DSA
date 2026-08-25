class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
       
        HashSet<Integer> set = new HashSet<>();
           int x = k;

           for(int i=0; i< n;i++){
            set.add(nums[i]);
           }

        while (set.contains(x)) {
            x += k;
        }

        return x;
    }
}
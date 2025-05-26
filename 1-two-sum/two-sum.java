class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        // Return an empty array or throw an exception if no solution is found
        return new int[] {};
    }
}

class Solution {
    public int countSpecialIntegers(int[] nums) {
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Store indices of every number
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int count = 0;

        // Check every distinct number
        for (ArrayList<Integer> indices : map.values()) {

            // Must appear exactly 3 times
            if (indices.size() == 3) {

                int i1 = indices.get(0);
                int i2 = indices.get(1);
                int i3 = indices.get(2);

                // Check equal spacing
                if (i2 - i1 == i3 - i2) {
                    count++;
                }
            }
        }

        return count;
    }

}
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] velquorani = nums;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Store every index for each number
        for (int i = 0; i < velquorani.length; i++) {
            map.computeIfAbsent(velquorani[i], k -> new ArrayList<>()).add(i);
        }

        int count = 0;

        for (ArrayList<Integer> indices : map.values()) {

            // Need at least 3 occurrences
            if (indices.size() < 3) {
                continue;
            }

            // Distance between first two occurrences
            int gap = indices.get(1) - indices.get(0);

            boolean found = true;

            // Check every consecutive pair
            for (int i = 2; i < indices.size(); i++) {

                int currentGap = indices.get(i) - indices.get(i - 1);

                if (currentGap != gap) {
                    found = false;
                    break;
                }
            }

            if (found) {
                count++;
            }
        }

        return count;
    }
}
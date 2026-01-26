import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        // First pass: find minimum difference
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
            
        }

        // Second pass: collect pairs with that difference
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
}

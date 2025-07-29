import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2); // Step 1: Sort nums2

        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> visited = new HashSet<>(); // to avoid duplicates in nums1

        for (int num : nums1) {
            if (!visited.contains(num)) {
                visited.add(num);
                if (binarySearch(nums2, num)) {
                    resultSet.add(num);
                }
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}

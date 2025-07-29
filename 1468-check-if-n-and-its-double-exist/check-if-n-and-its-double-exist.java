

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            if (bst(arr, target, i)) {
                return true;
            }
        }

        return false;
    }

    private boolean bst(int[] arr, int target, int skipIndex) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                if (mid != skipIndex) return true;
                // Check if duplicate of target exists at nearby indices
                if (mid - 1 >= 0 && arr[mid - 1] == target && mid - 1 != skipIndex) return true;
                if (mid + 1 < arr.length && arr[mid + 1] == target && mid + 1 != skipIndex) return true;
                return false;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}

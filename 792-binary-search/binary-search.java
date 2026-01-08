class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length - 1, target);
    }

    public int binarysearch(int[] nums, int start, int last, int target) {
        if (start > last) {
            return -1; // target not found
        }

        int mid = start + (last - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarysearch(nums, start, mid - 1, target);
        } else {
            return binarysearch(nums, mid + 1, last, target);
        }
    }
}

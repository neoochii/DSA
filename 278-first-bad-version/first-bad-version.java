/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if ( isBadVersion(mid)) {
               end = mid;
            } else if ( !isBadVersion(mid)) {
                start = mid + 1;
            }
            if(start == end && isBadVersion(start)){
                return start;
            }
        }
        return -1;
    }
}
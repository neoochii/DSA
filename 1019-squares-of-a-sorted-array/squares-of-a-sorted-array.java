
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] res = new int[nums.length];
      int i =0;
        for(int n : nums){
           res[i] = n*n;
           i++;
        }
      Arrays.sort(res);
        return res;
    }
}
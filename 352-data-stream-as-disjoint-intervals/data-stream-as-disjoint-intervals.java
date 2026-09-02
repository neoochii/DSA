import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

class SummaryRanges {
    // 1. Fixed variable name: changed 'set' to 'st' to match your methods
    HashSet<Integer> st = new HashSet<>();

    public SummaryRanges() {
        st.clear();
    }
    
    public void addNum(int value) {
        st.add(value);
    }
    
    public int[][] getIntervals() {
        int[] nums = st.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(nums);

        // 2. Fixed type: changed ArrayList<Integer<Integer>> to ArrayList<int[]>
        ArrayList<int[]> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int left = nums[i];
            
            // 3. Fixed Out of Bounds: Added (i + 1 < n) check before accessing nums[i + 1]
            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            // 4. Fixed syntax: Used standard array initialization syntax
            result.add(new int[]{left, nums[i]});
        }
        
        // 5. Fixed return type: Converted the ArrayList<int[]> back to a 2D int[][] array
        return result.toArray(new int[result.size()][]);
    }
}

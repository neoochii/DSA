class Solution {
    public int largestAltitude(int[] gain) {
        int start =0 ;
        int high = 0;

        for(int i: gain){
            start += i;
            high = Math.max(start,high);
        }
        return high;
    }
}
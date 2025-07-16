class Solution {
    public int largestAltitude(int[] gain) {
       
        int sum =0;
        int max =0;

        for (int c: gain){
           
            sum += c;
            max = Math.max(sum , max);

        }
        return max;
       
    }
}
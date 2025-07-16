class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum =0;
        int max =0;

        for (int c: gain){
           
            sum += c;
             result.add(sum);

        }
        for( int c : result){
            if(c > max){
                max = c;
            }
        }
        return max;
    }
}
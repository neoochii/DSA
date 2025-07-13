class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = 0;
        for(int a : candies){
            if(a > max){
                max =a;
            }
        }
        for(int a :candies){
            result.add( a + extraCandies >= max);
        }
        return result;

       
    }
}
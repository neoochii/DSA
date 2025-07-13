class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt(); 

        for(int a : candies){
            if(a+extraCandies >= max ){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }
}
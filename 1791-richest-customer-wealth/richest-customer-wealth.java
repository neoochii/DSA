class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int max =0;

        for(int[] i : accounts){
             int sum =0;
            for(int j : i){
                sum += j;


            }
            if(max< sum){
                max =sum;
                
            }
        }
        return max;
        
    }
}
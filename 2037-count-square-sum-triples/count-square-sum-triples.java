class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i =1 ; i <=n ;i++){
            for(int j = i+1;j<=n;j++){
               int sum =  (i*i + j*j);
               int x = (int)Math.sqrt(sum);
               if(x*x == sum  && x<=n ){
                count += 2 ;
               }
            }
        }
        return count;
        
    }
}
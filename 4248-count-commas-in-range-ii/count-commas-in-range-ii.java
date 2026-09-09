   
   class Solution {

    /*so here we get comma after every 10power3 , or 1000; 
    till 10^3  to 10^6 -1 ,
         10^6  to 10^9 -1 ,, two(commas ) 


    */
    public long countCommas(long n) {
      long res = 0;
        long   p = 1000;
        for (int i = 1; i <= 5; ++i) {
            if (n >= p) {
                res += n - p + 1;
            }
            p *= 1000;
        }
        return res;
    }}
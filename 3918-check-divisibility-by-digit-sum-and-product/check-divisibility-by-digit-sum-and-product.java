class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum =0;
        int product =1;
        
        while( n  > 0){
            int x = n % 10;

            sum += x;
            product *= x;
            n = n/10;

            

        }
        if( original %( sum+ product) != 0){
            return false;
        }

        return true;
    }
}
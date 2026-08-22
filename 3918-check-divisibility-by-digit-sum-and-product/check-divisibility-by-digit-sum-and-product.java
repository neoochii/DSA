class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int digitsum =0;
        int digitproduct = 1;
        
      while(n > 0){
          int digit = n % 10;
          digitsum += digit;
          digitproduct *= digit;
          n /= 10;
      }

        int total = digitsum + digitproduct;
        return original % total == 0;
    }
}
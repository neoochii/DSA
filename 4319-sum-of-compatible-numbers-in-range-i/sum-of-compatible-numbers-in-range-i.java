class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int total = n + k;
             int temp = 0;
        for(int i = 1 ; i<= total ; i++){
       
             if(Math.abs(n- i) <= k  && (n & i) ==  0){
                temp += i;
             }
        }
        return temp;
    }
}
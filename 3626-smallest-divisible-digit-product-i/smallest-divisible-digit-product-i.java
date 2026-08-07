class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; i <= n+ 10; i++) {
          
            if(mul(i) % t == 0){
                return i;
            }
        }
        return -1;
    }
       public int mul(int num){
        int x = 1;
        while(num >0 ){
             x *=  num % 10;
             if(x == 0){
                return 0;
             }
            num = num /10;

        }
        return  x;
    }
}
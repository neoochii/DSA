class Solution {
    public boolean canAliceWin(int n) {
        int x =10;
        int bob =0;
        int step =0;
        while(n >= x){
              n -= x;
          

          
            x--;
            step++;
        
        }
      if(step % 2 ==0 ){
        return false;
      }
      return true;
     
    }
}
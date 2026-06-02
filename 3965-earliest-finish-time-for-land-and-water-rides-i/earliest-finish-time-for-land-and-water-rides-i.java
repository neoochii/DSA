class Solution {
    public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
   int miL = Integer.MAX_VALUE,miW = miL , res = miW ;

   int L = startL.length;
   int W = startW.length;

   for(int i = 0 ; i< L ;i++){
    miL = Math.min(miL , startL[i]  + durL[i]);


   }
   for(int i = 0 ; i < W ; i++){
    miW = Math.min(miW ,startW[i] + durW[i]);
    res = Math.min(res , Math.max(miL , startW[i]) + durW[i]);
   }

   for(int i = 0; i < L ; i++){
    res = Math.min(res, Math.max(miW , startL[i])+durL[i]);

   }
   return res;


    }
}
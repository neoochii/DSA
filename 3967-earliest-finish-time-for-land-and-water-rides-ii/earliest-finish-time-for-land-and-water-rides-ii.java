class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
      int  minL =Integer.MAX_VALUE , minW = minL , res = minW ;

        int L = landStartTime.length;
        int W = waterStartTime.length;

        for(int i =0; i< L ; i++){
            minL = Math.min(minL , landStartTime[i] + landDuration[i]);
        }
        for(int i = 0 ; i<W ; i++){
            minW = Math.min(minW , waterStartTime[i] + waterDuration[i]);

            res = Math.min(res, Math.max(minL , waterStartTime[i]) + waterDuration[i]);
        }

        for(int i =0; i<L ; i++) {
            res = Math.min(res, Math.max(minW , landStartTime[i]) + landDuration[i]);
        }

        return res;
    }
}
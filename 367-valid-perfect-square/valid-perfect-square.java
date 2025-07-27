class Solution {
    public boolean isPerfectSquare(int num) {
        int start =0;
        int end= num;
        while(start<= end){
            int mid = start + (end - start)/2;
            long cross = (long) mid *mid;
            if(cross == num){
                return true;
            }else if(cross > num){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return false;
        
    }
}
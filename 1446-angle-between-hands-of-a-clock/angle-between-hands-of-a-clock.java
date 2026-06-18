class Solution {
    public double angleClock(int hour, int minutes) {
       

        double init=hour*30;
        double minut=minutes*6;

        double delta=(minutes*1.0)/2;
        init+=delta;

        double ans=Math.abs(minut-init);
        ans=Math.min(ans,360-ans);
        return ans;

    }
}
class Solution {
    public int maxDepth(String s) {
        int max =0;
        int n = s.length();
        int count =0;
        for(int i = 0 ; i< n ;i++){

           if( s.charAt(i) == '('){
            count++;
           }
           if( s.charAt(i) == ')'){
            count--;
           }

           max = Math.max(count, max);
        }
        return max;
    }
}
class Solution {
    public int countGoodSubstrings(String s) {
        int start =0;
        int count =0;

        int[] a= new int[26];

        for(int i =0; i< s.length();i++){
            a[s.charAt(i) - 'a']++;
            int size = i - start +1;
            
            if(size== 3){
            if(isGood(a)){
                count++;
            }
            a[s.charAt(start++)- 'a']--;}
        }

        return count;
    }
    private boolean isGood(int[] a){
        for(int i =0; i< a.length ;i++){
            if(a[i] > 1){
                return false;
            }
        }
        return true;
    }
}
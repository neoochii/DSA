class Solution {
    public int countGoodSubstrings(String s) {
        int start =0;
        int count =0;

        int[] arr = new int[26];
        for(int end =0; end < s.length(); end++){
            arr[s.charAt(end) - 'a']++;
            int range = end- start +1;
            if(range == 3){
                if(isGoodString(arr)){
                    count++;
                }
                arr[s.charAt(start++) - 'a']--;
             
            }
        }
        return count;
    }

    private boolean isGoodString(int[] arr){
        for(int i =0; i< 26;i++){
            if(arr[i]> 1){
                return false;
            }
        }
        return true;
    }
}
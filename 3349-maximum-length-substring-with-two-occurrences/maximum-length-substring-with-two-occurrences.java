class Solution {
    public int maximumLengthSubstring(String S) {
        int n = S.length();
        int i =0;
        int j =0;
        int[] freq = new int[26];
        int result =0;

        while(j< n){
            char[] s = S.toCharArray();
            int idx = s[j] - 'a';
            freq[idx]++;
          while(freq[idx] > 2) {
                freq[s[i]-'a']--;
                i++;
            }

            result = Math.max(result, j-i+1);
            j++;
        }
        return result;
    }

   
}
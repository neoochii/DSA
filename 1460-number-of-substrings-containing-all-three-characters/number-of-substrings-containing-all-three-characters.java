/* class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;
        int[] p = {-1, -1, -1};

        for (int i = 0; i < s.length(); i++) {
            p[(s.charAt(i) & 31) - 1] = i;
            res += Math.min(p[0], Math.min(p[1], p[2])) + 1;
        }

        return res;
    }
} */
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int result = 0;
        int[] mp = new int[3]; // 0 - a, 1 - b, 2 - c
        
        int i = 0, j = 0;
        while (j < n) {
            char ch = s.charAt(j);
            mp[ch - 'a']++;
            
            while (mp[0] > 0 && mp[1] > 0 && mp[2] > 0) {
                result += (n - j);
                mp[s.charAt(i) - 'a']--;
                i++;
            }
            
            j++;
        }
        
        return result;
    }
}
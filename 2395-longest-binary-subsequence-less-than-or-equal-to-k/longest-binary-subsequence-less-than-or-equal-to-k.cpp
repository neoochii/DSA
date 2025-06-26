class Solution {
public:
    int longestSubsequence(string s, int k) {
        int n = s.size(), maxLen = 0;
        long long num = 0, power = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (s[i] == '0') {
                maxLen++;
            } else {
                if (num + power > k) continue;
                num += power;
                maxLen++;
            }
            if (power <= k) power <<= 1;
        }
        return maxLen;
    }
};
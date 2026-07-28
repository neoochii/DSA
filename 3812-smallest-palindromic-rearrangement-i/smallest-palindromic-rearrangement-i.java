class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int half = n / 2; // Keep this consistent
        char[] chars = s.toCharArray();
        
        // Sort the first half
        Arrays.sort(chars, 0, half);
        
        // Mirror the first half to the second half using the char array
        for (int i = 0; i < half; i++) {
            chars[n - 1 - i] = chars[i];
        }
        
        // Return a new string from the modified char array
        return new String(chars);
    }
}
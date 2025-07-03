class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while (s.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                // Increment character or wrap from 'z' to 'a'
                char nextChar = (ch == 'z') ? 'a' : (char)(ch + 1);
                next.append(nextChar);
            }
            s += next.toString();
        }
        return s.charAt(k - 1);
    }
}

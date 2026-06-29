class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int matchCount = 0;

        for (String pat : patterns) {
            // Check directly if the pattern exists inside the word
            if (word.contains(pat)) {
                matchCount++;
            }
        }
        
        return matchCount;
    }
}

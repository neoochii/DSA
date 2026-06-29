class Solution {
    public int numOfStrings(String[] patterns, String word) {
         Map<Integer, String> map = new HashMap<>();
        int counter = 1;

        // Nested loops to find all substrings
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                // Extract substring
                String sub = word.substring(i, j);
                
                // Add to map using a unique counter as the key
                map.put(counter, sub);
                counter++;
            }
        }
        int matchCount = 0;


        for(String ch : patterns ){
             if (map.containsValue(ch)) {
                matchCount++;
            }
        }
        return matchCount;
    }
}
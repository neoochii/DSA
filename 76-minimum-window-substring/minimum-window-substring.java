class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n =s.length();
        for(char ch: t.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            
        }
         int count =t.length();
        int i =0;
        int j=0;
        int result = Integer.MAX_VALUE;
        int start_i = 0;




        while(j <n){
            char ch = s.charAt(j);

            if(mp.containsKey(ch) && mp.get(ch) > 0)
               count--;

            mp.put(ch, mp.getOrDefault(ch, 0) -1);
            while(count == 0){
                int currsize = j -i +1;
                if(result > currsize){
                    result = currsize;
                    start_i  =i;
                }

                char startChar = s.charAt(i);
                mp.put(startChar, mp.getOrDefault(startChar, 0)+1);

                if(mp.containsKey(startChar) && mp.get(startChar) >0){
                    count++;
                }
                i++;
            }
            j++;
           


        }
        return result == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i  + result);
    }
}
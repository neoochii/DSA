class Solution {

     public boolean allZero(int[] counter){
        for(int i : counter){
            if(i !=0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        int n = s.length();

        int[] rep = new int[26];
        
        int k = p.length();

        for(char ch : p.toCharArray()){
            rep[ch - 'a']++;
        }

        
        int i =0; 
        int j=0;
        ArrayList<Integer> res = new ArrayList<>();


        while(j < n){
            rep[s.charAt(j) - 'a']--;
            
            if(j -i + 1 ==k ){
                if(allZero(rep)){
                    res.add(i);
                }
                rep[s.charAt(i) - 'a']++;
                i++;


            }
            j++;

        }


return res;
        
    }
}
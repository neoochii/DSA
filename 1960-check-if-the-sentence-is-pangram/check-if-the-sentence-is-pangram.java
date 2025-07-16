class Solution {
    public boolean checkIfPangram(String sentence) {
       
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, 0);

        for(char c : sentence.toCharArray()){
            int index = c - 'a';
            alphabet[index]++;

        }

        for(int a : alphabet){
            if(a == 0){
                return false;
            }
        }
        return true;
    }
}
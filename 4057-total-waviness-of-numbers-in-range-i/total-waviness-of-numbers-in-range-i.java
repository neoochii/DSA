class Solution {
    public int totalWaviness(int num1, int num2) {
         
         


        int sol = 0;
         

        for(int j = num1 ; j <= num2 ; j++){
             String s = String.valueOf(Math.abs(j));
              int length = s.length();
               int mid = length / 2;
            

            if(length < 3){
                continue;
            }
            

                for(int i = 1 ; i<= length - 2; i++){
                    if(Character.getNumericValue(s.charAt(i)) >Character.getNumericValue(s.charAt(i-1)) &&Character.getNumericValue(s.charAt(i)) >Character.getNumericValue(s.charAt(i+1))){
                        sol++;
                    }
                     if(Character.getNumericValue(s.charAt(i)) <Character.getNumericValue(s.charAt(i-1)) &&Character.getNumericValue(s.charAt(i))<Character.getNumericValue(s.charAt(i+1))){
                        sol++;
                    }
                }

                
            



        }
        return sol;
    }
}
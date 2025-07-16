class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int idex = 0;
         int ans =0;
         if(ruleKey.equals("type")){
            idex=1;
         }else if(ruleKey.equals("color")){
             idex =2;

         }else{
            idex =3;
         }

         for(int i = 0; i< items.size() ;i++){
            if(items.get(i).get(idex-1).equals(ruleValue)){
                ans++;
            }
           
         }
         return ans;



    }
}
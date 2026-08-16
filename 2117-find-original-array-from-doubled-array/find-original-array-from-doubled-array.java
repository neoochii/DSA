class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length ;
        
        if( n % 2 != 0){
            return new int[]{};
        }
        Arrays.sort(changed);
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();


        for(int num : changed){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
          for(int num : changed){
            int twice = 2 * num;

            if(mp.get(num) ==  0){
                continue;
            }
            if(!mp.containsKey(twice) || mp.get(twice) == 0){
                return new int[0];
            }

            resultList.add(num);
            mp.put(num, mp.get(num) - 1);
            mp.put(twice,mp.get(twice) -1);


          }
            int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
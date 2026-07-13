class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> r = new LinkedList<>();
          List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            r.add(i);
        }
        while(!r.isEmpty()){
            int n = r.poll();
            if(n >= low && n <= high){
                list.add(n);
            }
            int last = n % 10;
            if(last + 1 <= 9){
                r.add(n * 10 + (last + 1));
            }
        }

        
        return list;



    }
}
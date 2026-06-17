class Solution {

    public int[] topologicalsor(  ArrayList<ArrayList<Integer>> adj,  int n , int[] deg){
           Queue<Integer> q = new LinkedList<>();
           int count = 0;
         ArrayList<Integer> res = new ArrayList<>();


        for(int i=0 ; i< n ; i++){
            if(deg[i] == 0 ){
                count++;
                q.add(i);
                res.add(i);
            }
        }

        while(!q.isEmpty()){
        
            int u = q.poll();

            for(int v : adj.get(u)){
                deg[v]--;
                if(deg[v] == 0){
                    q.add(v);
                    res.add(v);
                    count++;

                }
            }



        }
       if (count != n) {
    return new int[]{};
}

int[] ress = new int[n];
for (int i = 0; i < n; i++) {
    ress[i] = res.get(i);
}

return ress;






    }
    public int[] findOrder(int V, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i< V ; i++){
            adj.add(new ArrayList<>());

        }
        for(int[] i : prerequisites){
            int u = i[0];
            int v = i[1];

            adj.get(v).add(u);

        }

        int[] deg = new int[V];

        for(int i =0; i< V ; i++){
          for(int v: adj.get(i)){
            deg[v]++;
          }
        }

     

        return topologicalsor(adj ,V ,deg);


    }
}
class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int node , boolean[] vis, boolean[] recurr){

        vis[node] = true;
        recurr[node] = true;
        for(int it : adj.get(node)){
            if(!vis[it]  &&  dfs(adj, it , vis, recurr) ){
               return true;
            }else if(recurr[it]){
                return true;
            }
        }
      recurr[node] = false;
      return false;






    }
    public boolean canFinish(int V, int[][] edg) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0 ;i < V ;i++ ){
            adj.add(new ArrayList<>());
        }
        for(int[] i: edg){
            int u = i[0];
            int v = i[1];
            adj.get(u).add(v);
        }
           
           boolean[] vis = new boolean[V];
         Deque<Integer> stack = new ArrayDeque<>();
         boolean[] recurr = new boolean[V];

         for(int i =0 ; i< V;i++){
            if(!vis[i]&& dfs(adj , i, vis , recurr))
            return false;
         }
         return true;
    }
}
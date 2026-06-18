class Solution {

    boolean dfs(ArrayList<ArrayList<Integer>> adj,
            int node,
            boolean[] vis,
            boolean[] pathVis,
            Deque<Integer> st) {

    vis[node] = true;
    pathVis[node] = true;

    for (int it : adj.get(node)) {

        if (!vis[it]) {
            if (dfs(adj, it, vis, pathVis, st))
                return true;
        }
        else if (pathVis[it]) {
            return true; // cycle found
        }
    }

    pathVis[node] = false;
    st.push(node);

    return false;
}


    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0 ; i< V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i : edges){
            int u = i[0];
            int v = i[1];
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[V];
       boolean[] pathVis = new boolean[V];
        Deque<Integer> st = new ArrayDeque<>();
      
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(adj, i, vis, pathVis, st))
                    return new int[0];
            }
        }
      

  int[] res = new int[V];
        int idx = 0;

        while (!st.isEmpty()) {
            res[idx++] = st.pop();
        }

        return res;



        
    }
}
class Solution {

    public int[] topologicalSort(ArrayList<ArrayList<Integer>> adj,
                                 int n, int[] indegree) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int[] ans = new int[n];
        int idx = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            ans[idx++] = u;

            for (int v : adj.get(u)) {
                if (--indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        return idx == n ? ans : new int[]{};
    }

    public int[] findOrder(int V, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            adj.get(pre).add(course);
            indegree[course]++;
        }

        return topologicalSort(adj, V, indegree);
    }
}
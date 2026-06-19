class Solution {

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, int[] colour, int colr) {
        colour[node] = colr;

        for (int i : adj.get(node)) {
            if (colour[i] == colour[node]) {
                return false;
            }

            if (colour[i] == -1) {
                if (!dfs(adj, i, colour, 1 - colr)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // FIXED GRAPH BUILD
        for (int i = 0; i < n; i++) {
            for (int v : graph[i]) {
                adj.get(i).add(v);
            }
        }

        int[] colour = new int[n];
        Arrays.fill(colour, -1);

        for (int i = 0; i < n; i++) {
            if (colour[i] == -1) {
                if (!dfs(adj, i, colour, 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}
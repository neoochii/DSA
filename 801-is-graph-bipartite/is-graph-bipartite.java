class Solution {

    private boolean dfs(int[][] graph, int node, int color, int[] colours) {
        colours[node] = color;

        for (int nei : graph[node]) {
            if (colours[nei] == color) {
                return false;
            }

            if (colours[nei] == -1 &&
                !dfs(graph, nei, 1 - color, colours)) {
                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colours = new int[n];
        Arrays.fill(colours, -1);

        for (int i = 0; i < n; i++) {
            if (colours[i] == -1 &&
                !dfs(graph, i, 0, colours)) {
                return false;
            }
        }

        return true;
    }
}
class Solution {

    private boolean bfs(int[][] graph, int src, int[] colours) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        colours[src] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : graph[u]) {
                if (colours[v] == -1) {
                    colours[v] = 1 - colours[u];
                    q.offer(v);
                } else if (colours[v] == colours[u]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colours = new int[n];
        Arrays.fill(colours, -1);

        for (int i = 0; i < n; i++) {
            if (colours[i] == -1 && !bfs(graph, i, colours)) {
                return false;
            }
        }

        return true;
    }
}
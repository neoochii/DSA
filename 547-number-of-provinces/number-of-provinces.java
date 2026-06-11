class Solution {

    private void bfs(int[][] isConnected, int start, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v = 0; v < isConnected.length; v++) {
                if (isConnected[u][v] == 1 && !vis[v]) {
                    vis[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(isConnected, i, vis);
                count++;
            }
        }

        return count;
    }
}
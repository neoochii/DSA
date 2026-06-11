class Solution {

    private void dfs(int city, int[][] isConnected, boolean[] vis) {
        vis[city] = true;

        for (int next = 0; next < isConnected.length; next++) {
            if (isConnected[city][next] == 1 && !vis[next]) {
                dfs(next, isConnected, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                provinces++;
                dfs(i, isConnected, vis);
            }
        }

        return provinces;
    }
}
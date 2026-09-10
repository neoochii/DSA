class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        
        if(n == 1)
            return 0;
        
        boolean[] visited = new boolean[n];
        
        // why ?
        // Because, we need to access those indices where arr[i] == arr[j]
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            mp.putIfAbsent(arr[i], new ArrayList<>());
            mp.get(arr[i]).add(i);
        }
        
        Queue<Integer> que = new LinkedList<>();
        que.offer(0);
        visited[0] = true;
        
        int steps = 0;
        
        while(!que.isEmpty()) {
            int size = que.size();
            
            //check this level
            while(size-- > 0) {
                int curr = que.poll();
                
                if(curr == n - 1) {
                    //BFS ensures minimum steps
                    //We are moving level by level
                    return steps;
                }
                
                int left  = curr - 1;
                int right = curr + 1;
                
                if(left >= 0 && !visited[left]) {
                    que.offer(left);
                    visited[left] = true;
                }
                
                if(right < n && !visited[right]) {
                    que.offer(right);
                    visited[right] = true;
                }
                
             List<Integer> sameValueIndices = mp.get(arr[curr]);
                if (sameValueIndices != null) {
                    for (int idx : sameValueIndices) {
                        if (!visited[idx]) {
                            que.offer(idx);
                            visited[idx] = true;
                        }
                    }
                    mp.remove(arr[curr]);
                }
                
                //If you don't erase it, you may be again checking for it
                //in future. It will cause TLE
             
            }
            
            steps++;
        }
        
        return -1;
    }
}
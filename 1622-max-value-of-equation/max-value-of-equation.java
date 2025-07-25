class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
      int n = points.length;
        int max = Integer.MIN_VALUE;

        // Each element in deque is an int[] = {x, y - x}
        Deque<int[]> dq = new ArrayDeque<>();

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            // Remove elements from front if they are out of the k window
            while (!dq.isEmpty() && x - dq.peekFirst()[0] > k) {
                dq.pollFirst();
            }

            // If deque is not empty, update max with best candidate
            if (!dq.isEmpty()) {
                max = Math.max(max, y + x + dq.peekFirst()[1]); // y + x + (yi - xi)
            }

            // Maintain deque in decreasing order of (y - x)
            while (!dq.isEmpty() && dq.peekLast()[1] <= y - x) {
                dq.pollLast();
            }

            // Add current point
            dq.offerLast(new int[]{x, y - x});
        }

        return max;
    }
}
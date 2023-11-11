class Solution {
    // Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        // code here
        if (X == 0)
            return 0;
        int level = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int curr = q.poll();
                for (int j : adj.get(curr)) {
                    if (curr == X)
                        return level;
                    if (!vis[j]) {
                        q.add(j);
                        vis[j] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
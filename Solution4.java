class Solution4{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int n, int graph[][]) {
		for (int via = 0; via < n; via++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (graph[i][j] == 0 && graph[i][via] == 1 && graph[via][j] == 1) {
						graph[i][j] = 1;
					}
					if (i == j) {
						graph[i][j] = 1;
					}
				}
			}
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				row.add(graph[i][j]);
			}
			ans.add(row);
		}
		return ans;
	}
}
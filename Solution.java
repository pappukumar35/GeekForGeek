class Solution{
    static int knapSack(int N, int W, int val[], int wt[]) {
        Integer[][] memo = new Integer[N + 1][W + 1];
        return solve(N, W, val, wt, memo);
    }
    
    static int solve(int N, int W, int[] val, int[] wt, Integer[][] memo) {
        if (N == 0) {
            return 0;
        }
        
        if (W < 0) {
            return 0;
        }
        
        if (memo[N][W] != null) {
            return memo[N][W];
        }
        
        int notPick = solve(N - 1, W, val, wt, memo);
        int pick = 0;
        if (wt[N - 1] <= W) {
            pick = val[N - 1] + solve(N, W - wt[N - 1], val, wt, memo);
        }
        
        return memo[N][W] = Math.max(notPick, pick);
    }
}
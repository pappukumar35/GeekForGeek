class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int dp[][] = new int[n+1][m+1];
        for(int j = m-1; j>=0; j--){
            for(int i = n-1; i>=0; i--){
                if(i-1 >= 0)
                    dp[i][j] = M[i][j] + Math.max(dp[i-1][j+1], Math.max(dp[i][j + 1], dp[i+1][j+1]));
                else
                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], dp[i+1][j+1]);
                    
            }   
        }
        
        int ans = dp[0][0];
        for(int i = 1; i<n; i++){
            ans = Math.max(ans, dp[i][0]);
        }
        
        return ans;
    }
}
class Solution{
	static boolean helper( int i,int j,String w,String p,Boolean dp[][]) {
		if(i==0 || j==0) {
			if(i!=j)return false;			
			else if(w.charAt(i)!=p.charAt(j))return false;
		    else return true;
		}
		
		if(dp[i][j]!=null) return dp[i][j];
		
		
		if(w.charAt(i)==p.charAt(j)) {
			return dp[i][j]=helper(i-1,j-1,w,p,dp);
		}else if(w.charAt(i)=='*') {			
				return dp[i][j]=helper(i,j-1,w,p,dp)||helper(i-1,j-1,w,p,dp);			
		}else if(w.charAt(i)=='?'){
			return dp[i][j]=helper(i-1,j-1,w,p,dp);
		}else return dp[i][j]=false; 
	}
	
    static boolean match(String wild, String pattern)
    {
        wild="#"+wild;
        pattern="#"+pattern;
    	int n=wild.length();
    	int m=pattern.length();
    	Boolean dp[][]=new Boolean[n][m]; 
        return helper(n-1,m-1,wild, pattern,dp);
    }
}
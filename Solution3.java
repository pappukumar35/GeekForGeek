class Solution3{
    int par[],rank[];
    public int largestIsland(int n,int[][] grid) 
    {
        par = new int[n*n];
        rank = new int[n*n];
        
        for(int i=0;i<n*n;i++)
        {
            par[i] = i;
        }
        
        
        int vis[][] = new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0) continue;
                
                dfs(i,j,-1,-1,n,grid,vis);
            }
        }
        
        int cnt[] = new int[n*n],ans = 0;
        
        for(int i=0;i<n*n;i++)
        {
            int p = find(par[i]);
            cnt[p]++;
            ans = Math.max(ans,cnt[p]);
        }
        
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1) continue;
                int tot = 1;
                if(j+1<n && grid[i][j+1]==1)
                {
                    int p = find(i*n+j+1);
                    tot+=(set.add(p)?cnt[p]:0);
                }
                if(j-1>=0 && grid[i][j-1]==1)
                {
                    int p = find(i*n+j-1);
                    tot+=(set.add(p)?cnt[p]:0);
                }
                if(i+1<n && grid[i+1][j]==1)
                {
                    int p = find((i+1)*n+j);
                    tot+=(set.add(p)?cnt[p]:0);
                }
                if(i-1>=0 && grid[i-1][j]==1)
                {
                    int p = find((i-1)*n+j);
                    tot+=(set.add(p)?cnt[p]:0);
                }
                set.clear(); 
                ans = Math.max(ans,tot);
            }
        }
        
        return Math.max(ans,0);
    }
    
    void dfs(int i,int j,int par_i,int par_j,int n,int grid[][],int vis[][])
    {
        if(i<0 || j<0 || i==n || j==n || grid[i][j]==0 || vis[i][j]==1) return;
        
        vis[i][j] = 1;
        if(par_i!=-1)
        union(i*n+j,par_i*n+par_j);
        
        dfs(i,j+1,i,j,n,grid,vis);
        dfs(i+1,j,i,j,n,grid,vis);
        dfs(i-1,j,i,j,n,grid,vis);
        dfs(i,j-1,i,j,n,grid,vis);
    }
    
    int find(int node)
    {
        if(par[node]==node)
        return node;

        par[node] = find(par[node]);

        return par[node];
    }

    void union(int u,int v)
    {
        int up = find(u);
        int vp = find(v);

        if(up==vp) return ;
        else if(rank[up]<rank[vp])
        {
            par[up] = vp; //  merge all up node to vp
        } else if(rank[vp]<rank[up])
        {
            par[vp] = up; // merge all vp node to up
        } else {
            par[vp] = up; // if both rank equal 
            rank[up]++; // now rank of up is greater than vp
        }
    }
}
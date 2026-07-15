class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        
        int dp[][]=new int[n+1][W+1];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<W+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        
        return helper(W,val,wt,dp,n);
    }
    
    public int helper(int W,int val[],int wt[],int dp[][],int n)
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        
        if(wt[n-1]<=W)
        {
            int include=val[n-1]+helper(W-wt[n-1],val,wt,dp,n-1);
            int exclude=helper(W,val,wt,dp,n-1);
            
            dp[n][W]=Math.max(include,exclude);
        }
        else
        {
            dp[n][W]=helper(W,val,wt,dp,n-1);
        }
        
        return dp[n][W];
        
    }
}


class Solution {
    public static int findCatalan(int n) {
        // code here
        int dp[]=new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return helper(dp,n);
    }
    
    public static int helper(int dp[],int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            ans+=helper(dp,i)*helper(dp,n-i-1);
        }
        
        return dp[n]=ans;
    }
}

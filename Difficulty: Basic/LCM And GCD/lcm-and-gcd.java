class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int ans[]=new int[2];
        
        int x=a;
        int y=b;
        
        while(y!=0)
        {
            int rem=x%y;
            x=y;
            y=rem;
        }
        
        int GCD=x;
        
        int LCM=(a*b)/GCD;
        
        ans[0]=LCM;
        ans[1]=GCD;
        
        return ans;
    }
}
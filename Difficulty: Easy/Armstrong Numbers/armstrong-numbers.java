class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ans=0;
        
        int num=n;
        
        while(num>0)
        {
            int d=num%10;
            
            ans+=d*d*d;
            
            num=num/10;
        }
        
        if(ans==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
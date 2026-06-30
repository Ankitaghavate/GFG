class Solution {
    double power(double b, int e) {
        // code here
        double ans=1;
        long BF=e;
        
        if(b==0)
        {
           return 0.0; 
        }
        
        if(b==1 || e==0)
        {
            return 1.0;
        }
        
        if(e<0)
        {
            BF=-BF;
            b=1/b;
        }
        
        while(BF>0)
        {
            if(BF%2==1)
            {
                ans*=b;
            }
            b=b*b;
            
            BF=BF/2;
        }
        
        return ans;
    }
}
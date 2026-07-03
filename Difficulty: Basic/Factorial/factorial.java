class Solution {
    int factorial(int n) {
        // code here
        if(n==0 || n==1)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        else
        {
            return n*factorial(n-1);
        }
        
    }
}

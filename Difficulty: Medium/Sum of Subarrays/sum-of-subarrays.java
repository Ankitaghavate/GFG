class Solution {
    public int subarraySum(int[] arr) {
        // code here
        long n=arr.length;
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            ans+=(long)arr[i]*(i+1)*(n-i); 
        }
        return (int)ans;
    }
}

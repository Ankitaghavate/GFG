class Solution {
    public int findMin(int n) {
        // code here
        int coin[]={1,2,5,10};
        
        int count=0;
        
        Arrays.sort(coin);
        
        for(int i=coin.length-1;i>=0;i--)
        {
            while(coin[i]<=n)
            {
                n=n-coin[i];
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        long currSum=0;
        long maxSum=0;
        
        int left=0;
        int bestLeft=0;
        int bestRight=-1;
        int n=arr.length;
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int right=0;right<arr.length;right++)
        {
            if(arr[right]<0)
            {
                currSum=0;
                left=right+1;
            }
            else 
            {
                int currLength=right-left+1;
                int bestLength=bestRight-bestLeft+1;
                
                currSum+=arr[right];
                
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                    bestLeft=left;
                    bestRight=right;
                }
                else if(maxSum==currSum && currLength>bestLength)
                {
                    bestLeft=left;
                    bestRight=right;
                }
            }
        }
        
        if(bestRight==-1)
        {
            ans.add(-1);
            return ans;
        }
        for(int i=bestLeft;i<=bestRight;i++)
        {
            ans.add(arr[i]);
        }
            return ans;
        
    }
}
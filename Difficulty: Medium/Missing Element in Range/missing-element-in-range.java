class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        
        while(low<=high)
        {
            if(!hs.contains(low))
            {
                ans.add(low);
            }
            low++;
        }
        return ans;
    }
}
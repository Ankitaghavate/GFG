class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> ans=new ArrayList<>();
        
        
        
        for(int i=0;i<arr.length;i++)
        {
            List<Integer> curr=new ArrayList<>();
            
            for(int j=i;j<arr.length;j++)
            {
                curr.add(arr[j]);
                ans.add(new ArrayList<>(curr));
            }
        }
        return ans;
    }
}
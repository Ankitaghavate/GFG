class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<Integer> combination=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        helper(arr,0,target,combination,ans);
        
        return ans;
    }
    
    public void helper(int arr[],int i,int target,ArrayList<Integer> combination,ArrayList<ArrayList<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(combination));
            return;
        }
        
        if(target<0 || i==arr.length)
        {
            return ;
        }
        
        combination.add(arr[i]);
        
        helper(arr,i,target-arr[i],combination,ans);
        combination.remove(combination.size()-1);
        
        helper(arr,i+1,target,combination,ans);
    }
}
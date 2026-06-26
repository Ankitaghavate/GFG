class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        int maxele=arr[n-1];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            int ele=arr[i];
            
            if(ele>=maxele)
            {
                maxele=ele;
                ans.add(maxele);
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}

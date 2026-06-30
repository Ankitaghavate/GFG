class Solution {
    public void updateArray(int[] arr) {
        // code here
        int prev=1;
        int curr=arr[0];
        
        for(int i=0;i<arr.length-1 ;i++)
        {
            int next=arr[i+1];
            
            arr[i]=prev*curr*next;
            
            prev=curr;
            curr=next;
            
        }
        int n=arr.length;
        
        arr[n-1]=prev*curr*1;
    }
}
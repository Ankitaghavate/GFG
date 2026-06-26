class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        
        d=d%n;
        
        reversearr(arr,0,d-1);
        
        reversearr(arr,d,n-1);
        
        reversearr(arr,0,n-1);
    }
    
    public static void reversearr(int arr[],int st,int end)
    {
        while(st<=end)
        {
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            
            st++;
            end--;
        }
        
    }
}
class Solution {
    int countElements(int[] arr) {
        // code here
        int min=arr[0];
        int max=arr[0];
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
            hs.add(arr[i]);
        }
        int total=(max-min+1);
        
        return total-hs.size();
    }
}
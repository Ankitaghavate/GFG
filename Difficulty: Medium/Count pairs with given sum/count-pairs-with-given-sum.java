class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int count=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i];
            int complement=target-arr[i];
            
            if(map.containsKey(complement))
            {
                count+=map.get(complement);
            }
            map.put(arr[i],map.getOrDefault(ele,0)+1);
        }
        return count;
    }
}
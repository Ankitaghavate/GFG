class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            hs.put(arr1[i],hs.getOrDefault(arr1[i],0)+1);
        }
        int count=0;
        
        for(int i=0;i<arr2.length;i++)
        {
            if(hs.containsKey(arr2[i]))
            {
                count++;
                hs.put(arr2[i],hs.get(arr2[i])-1);
                
                 if(hs.get(arr2[i])==0)
                {
                    hs.remove(arr2[i]);
                }
            }
           
        }
        return count;
    }
}

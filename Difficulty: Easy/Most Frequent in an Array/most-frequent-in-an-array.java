class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int maxfreq=0;
        int ans=0;
        
        for(int num:arr)
        {
            int freq=map.get(num);
            
            if(freq==maxfreq)
            {
                ans=Math.max(num,ans);
            }
            else if(map.get(num)>maxfreq)
            {
                maxfreq=map.get(num);
                ans=num;
            }
        }
        
        return ans;
    }
}
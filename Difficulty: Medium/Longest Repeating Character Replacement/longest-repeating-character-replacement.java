class Solution {
    public int longestSubstr(String s, int k) {
        // code here
         int left=0,max=0,maxFreq=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            maxFreq=Math.max(maxFreq,map.get(ch));
            
            if((right-left+1)-maxFreq>k)
            {
                char leftch=s.charAt(left);
                
                map.put(leftch,map.get(leftch)-1);
                
                if(map.get(leftch)==0)
                {
                    map.remove(leftch);
                }
                left++;
            }
            
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}

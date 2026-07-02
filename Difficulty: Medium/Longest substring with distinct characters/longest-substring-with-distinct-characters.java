class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
        int max=0;
        HashSet<Character> hs=new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            while(hs.contains(ch))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,i-left+1);
            hs.add(ch);
        }
        return max;
    }
}
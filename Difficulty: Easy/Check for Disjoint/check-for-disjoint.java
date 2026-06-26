class Solution {
    public boolean areDisjoint(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++)
        {
            if(hs.contains(b[i]))
            {
                return false;
            }
        }
        return true;
    }
}
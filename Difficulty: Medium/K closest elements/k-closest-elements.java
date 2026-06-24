class Solution {
    public class Pair
    {
        int diff;
        int val;
        
        Pair(int diff,int val)
        {
            this.diff=diff;
            this.val=val;
        }
    }
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->
        {if(a.diff==b.diff)
        {
            return a.val-b.val;
        }
        else
        {
            return b.diff-a.diff;
        }});
        
        for(int num:arr)
        {
            if(num==x)
            {
                continue;
            }
            int diff=Math.abs(num-x);
            
            pq.add(new Pair(diff,num));
            
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        
        int ans[]=new int[k];
        int i=k-1;
        
        while(!pq.isEmpty())
        {
            ans[i--]=pq.remove().val;
        }
        return ans;
    }
}

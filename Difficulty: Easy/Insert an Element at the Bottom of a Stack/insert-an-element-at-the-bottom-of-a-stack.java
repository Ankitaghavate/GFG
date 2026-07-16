class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        helper(st,x);
        
        return st;
    }
    public void helper(Stack<Integer> s,int x)
    {
        if(s.isEmpty())
        {
            s.push(x);
            return;
        }
        
        int top=s.pop();
        insertAtBottom(s,x);
        s.push(top);
    }
}
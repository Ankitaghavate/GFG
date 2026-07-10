/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        if(head==null || head.next==null)
        {
            return head;
        }
        
        HashSet<Integer> hs=new HashSet<>();
        Node curr=head;
        Node prev=head;
        
        while(curr!=null)
        {
            if(hs.contains(curr.data))
            {
                prev.next=prev.next.next;
                curr=curr.next;
            }
            else
            {
                hs.add(curr.data);
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
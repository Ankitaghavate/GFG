/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        head=reverseLL(head);
        
        int i=1;
        
        while(i<k && head!=null)
        {
            head=head.next;
            i++;
        }
        
        if(head!=null)
        {
            return head.data;
        }
        return -1;
    }
    public static Node reverseLL(Node head)
    {
        Node prev=null;
        Node next;
        Node curr=head;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
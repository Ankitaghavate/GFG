/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if(head==null)
        {
            return null;
        }
        
        Node prev=head;
        Node curr=head.next;
        
        while(curr!=null)
        {
            if(prev.data==curr.data)
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
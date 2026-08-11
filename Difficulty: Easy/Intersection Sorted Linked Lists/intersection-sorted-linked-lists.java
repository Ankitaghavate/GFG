/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here
        Node p1=head1;
        Node p2=head2;
        
        Node d=new Node(-1);
        Node ans=d;
        
        while(p1!=null && p2!=null)
        {
            if(p1.data==p2.data)
            {
                Node newNode=new Node(p1.data);
                d.next=newNode;
                d=d.next;
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.data<p2.data)
            {
                p1=p1.next;
            }
            else
            {
                p2=p2.next;
            }
        }
        return ans.next;
    }
}
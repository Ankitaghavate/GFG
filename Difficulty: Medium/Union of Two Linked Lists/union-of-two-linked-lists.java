/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        HashSet<Integer> map=new HashSet<>();
        Node d=new Node(-1);
        Node ans=d;
        
        while(head1!=null)
        {
            if(!map.contains(head1.data))
            {
                map.add(head1.data);
                Node newNode=new Node(head1.data);
                d.next=newNode;
                d=d.next;
                head1=head1.next;
                
            }
            else
            {
                head1=head1.next;
            }
        }
        
        while(head2!=null)
        {
            if(!map.contains(head2.data))
            {
                map.add(head2.data);
                Node newNode=new Node(head2.data);
                d.next=newNode;
                d=d.next;
                head2=head2.next;
            }
            else
            {
                head2=head2.next;
            }
        }
        return ans.next;
    }
}
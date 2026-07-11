/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        head=reverseLL(head);
        
        int carry=1;
        Node temp=head;
        Node prev=null;
        
        while(temp!=null)
        {
            int sum=temp.data+carry;
            temp.data=sum%10;
            
            carry=sum/10;
            prev=temp;
            temp=temp.next;
        }
        
        if(carry>0)
        {
            prev.next=new Node(carry);
        }
        head=reverseLL(head);
        return head;
    }
    
    public Node reverseLL(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next;
        
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
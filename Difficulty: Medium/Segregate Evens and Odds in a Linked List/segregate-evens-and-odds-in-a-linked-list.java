/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node oddList=new Node(-1);
        Node evenList=new Node(-1);
        Node evenStart=evenList;
        Node oddStart=oddList;
        
        while(head!=null)
        {
            if(head.data%2==0)
            {
                Node newNode=new Node(head.data);
                evenList.next=newNode;
                evenList=evenList.next;
            }
            else
            {
                Node newNode=new Node(head.data);
                oddList.next=newNode;
                oddList=oddList.next;
            }
            head=head.next;
        }
        evenList.next=oddStart.next;
        
        return evenStart.next;
    }
}
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(slow==fast)
            {
                return countNodes(slow);
            }
        }
        return 0;
    }
    
    public int countNodes(Node head)
    {
        int ans=1;
        Node temp=head;
        
        while(temp.next!=head)
        {
            ans++;
            temp=temp.next;
        }
        return ans;
    }
}
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        
        int i=1;
        
        while(i<index && head!=null)
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
}
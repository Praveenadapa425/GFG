/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node tail=head;
        int n=1;
        while(tail.next!=null){
            tail=tail.next;
            n++;
        }
        tail.next=head;
       k=k%n;
        for(int i=0;i<k;i++){
           head=head.next;
           tail=tail.next;
        }
        tail.next=null;
        
        return head;
    }
}


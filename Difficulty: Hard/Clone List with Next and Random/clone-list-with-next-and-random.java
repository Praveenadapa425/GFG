
class Solution {
    // Function to clone a linked list with next and random pointer.
    Node cloneLinkedList(Node head) {
        // your code here
        
        if (head == null) {
            return null; 
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node temp=head;
        
        Node dummyHead= new Node (106);
        Node temp1=dummyHead;
        
        while(temp!=null){
            Node newNode = new Node(temp.data);
             map.put(temp, newNode);
                temp1.next=newNode;
                temp1=temp1.next;
                
    
            temp=temp.next;
        }
        temp1=dummyHead.next;
        temp=head;
        while(temp!=null){
            
           temp1.random = map.get(temp.random);
          temp1.next = map.get(temp.next);
           temp=temp.next;
           temp1=temp1.next;
           
           
        }
        return  dummyHead.next;
    }
}

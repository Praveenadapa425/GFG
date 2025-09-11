


class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        
        
        // Your code here
        
        if(head==null || head.next==null) return true;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        Node current=null;
        while(fast!=null && fast.next!=null){
            current=slow;
            slow=slow.next;
            
            fast=fast.next.next;
            
            current.next=prev;
            prev=current;
        }
        int flag=1;
        if(fast==null) flag=0;

        // System.out.println(flag);
        Node temp=prev;
        Node temp1=slow;
        if(flag==1) temp1=temp1.next;
        while(temp!=null && temp1!=null){
         if(temp.data!=temp1.data) return false;
        //   System.out.println(temp.data+ " "+temp1.data);
           temp=temp.next;
           temp1=temp1.next;
        }
        if(temp!=null || temp1!=null) return false;
        
        return true;
    }
}



//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    Node head=null;   // declaring and intilizing the head and tail Node
    Node tail=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here
	
	    // base case 
	    if(root==null){
	        return null;
	    }
	    
	    // to taversal to left side of tree
	    bToDLL(root.left);
	    // creating new Node 
	    Node newNode =new Node(root.data);
	    if(head==null){
	        
	        // if head is empty head , tail = newNode
	        head=tail=newNode;
	    }
	    else{
	        // else head is not empty
	        tail.right=newNode;
	        newNode.left=tail;
	        tail=newNode;
	    }
	    // to traversal right side
	    bToDLL(root.right);
	    return head;
    }
}
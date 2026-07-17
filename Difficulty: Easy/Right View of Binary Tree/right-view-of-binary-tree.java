/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        return dfs(root ,1, new ArrayList<Integer>());
    }
    private ArrayList<Integer> dfs(Node node ,int level, ArrayList<Integer> list){
        if(node == null) return list;
        
        if(list.size() < level){
            list.add(node.data);
            
        }
        dfs(node.right , level +1 , list);
        dfs(node.left , level +1, list);
        
        return list;
    }
}
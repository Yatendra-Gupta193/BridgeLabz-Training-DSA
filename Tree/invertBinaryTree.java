package Tree;

import java.util.*;
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class invertBinaryTree {
    public Node invertTree(Node root){
        if(root==null){
           return null; 
        }
        Node temp = root.left;
        root.left= root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(h) (h=height of tree)


















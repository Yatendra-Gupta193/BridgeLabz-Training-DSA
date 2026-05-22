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
public class inorderTraversal {
    static void inorder(Node root){
        if(root==null){
            return;
        }
        // inorder Traversal -  Left -> Root -> Right    
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[]args){
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        inorder(root);
        
        // Output - 4 2 5 1 3
    }
}

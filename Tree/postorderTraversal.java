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
public class postorderTraversal {
    static void postorder(Node root){
        if(root==null){
            return;
        }
        // PostOrder Traversal : Left -> Right -> Root
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[]args){
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        postorder(root);

        // Output : 4 5 2 3 1 
    }
}

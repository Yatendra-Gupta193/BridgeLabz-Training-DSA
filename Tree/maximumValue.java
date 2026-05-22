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
public class maximumValue {
    public static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Return minimum value if the tree is empty
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}

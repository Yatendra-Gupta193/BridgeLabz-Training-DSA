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

public class minimumValue {
    public static int findMin(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Return maximum value if the tree is empty
        }
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

}

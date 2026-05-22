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
public class maxDepth {
    public static int maxdepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxdepth(root.left);
        int rightDepth = maxdepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

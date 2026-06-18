package Tree;

class Node{
    int data;
    Node left,right; 

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class countNodes {
    public static int countnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countnodes(root.left);
        int rightCount = countnodes(root.right);
        return leftCount + rightCount + 1;
    }
}

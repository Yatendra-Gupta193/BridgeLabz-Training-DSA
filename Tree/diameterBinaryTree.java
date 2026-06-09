package Tree;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class diameterBinaryTree {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    // returns height of tree and updates diameter at each node
    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // update diameter at each node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // return height
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
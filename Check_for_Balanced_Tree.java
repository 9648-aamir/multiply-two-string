public class Check_for_Balanced_Tree {
    int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Your code here
        if (root == null)
            return true;
        int l = height(root.left);
        int r = height(root.right);

        if (Math.abs(l - r) > 1)
            return false;
        else
            return (true && isBalanced(root.left) && isBalanced(root.right));
    }
}

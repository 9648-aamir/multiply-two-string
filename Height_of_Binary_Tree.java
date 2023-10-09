public class Height_of_Binary_Tree {
    int height(Node node) {
        // code here
        if (node == null)
            return 0;
        int left = 1 + height(node.left);
        int right = 1 + height(node.right);
        return Math.max(left, right);
    }
}

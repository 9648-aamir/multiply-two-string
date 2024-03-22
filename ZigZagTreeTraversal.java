import java.util.ArrayList;

public class ZigZagTreeTraversal {
    // Function to store the zig zag order traversal of tree in a list.
    int len = 0;
    ArrayList<Integer> arr = new ArrayList<>();

    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.
        int i = 1;
        arr.clear();
        height(root, 1);
        while (i <= len) {
            if (i % 2 == 0)
                right(root, 1, i);
            else
                left(root, 1, i);
            i++;
        }
        return arr;

    }

    void height(Node root, int lvl) {
        if (root == null)
            return;
        len = Math.max(lvl, len);
        height(root.left, lvl + 1);
        height(root.right, lvl + 1);
    }

    void left(Node root, int lvl, int i) {
        if (root == null)
            return;
        if (lvl == i)
            arr.add(root.data);
        left(root.left, lvl + 1, i);
        left(root.right, lvl + 1, i);
    }

    void right(Node root, int lvl, int i) {
        if (root == null)
            return;
        if (lvl == i)
            arr.add(root.data);
        right(root.right, lvl + 1, i);
        right(root.left, lvl + 1, i);
    }
}

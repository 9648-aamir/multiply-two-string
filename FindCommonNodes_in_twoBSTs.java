import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonNodes_in_twoBSTs {
    

class Solution {
    public List<Integer> findCommon(Node root1, Node root2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate set1 with elements from the first tree
        preorder(root1, set1);

        // Populate set2 with elements from the second tree
        preorder(root2, set2);

        // Find the common elements between set1 and set2
        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }

    private void preorder(Node root, Set<Integer> set) {
        if (root == null)
            return;
        set.add(root.data);
        preorder(root.left, set);
        preorder(root.right, set);
    }
}

}

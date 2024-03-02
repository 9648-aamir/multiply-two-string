public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<List<TreeNode>> q = new LinkedList<List<TreeNode>>();
        q.add(new LinkedList<>());
        int level = 0;
        q.peek().add(root);
        //Level Order travelsal
        while(q.size()>0){
            List<TreeNode> levelNodes = q.remove();
            List<TreeNode> nextLevel = new LinkedList<>();
            for(TreeNode node: levelNodes) {
                if(node.left != null) nextLevel.add(node.left);
                if(node.right != null) nextLevel.add(node.right);
            }
            if(! verifyEvenOdd(levelNodes, level)) return false;
            if(nextLevel.size() == 0) continue;
            q.add(nextLevel);
            level++;
        }
        return true;
    }

    public boolean verifyEvenOdd(List<TreeNode> levelNodes, int level){
        int lastValue = 0;
        for(TreeNode node: levelNodes) {
                if(level % 2 == 0){
                    if(node.val % 2 == 0) return false;
                    if(lastValue >= node.val) return false;
                    else lastValue = node.val;
                } else {
                    if(lastValue == 0){
                        lastValue = Integer.MAX_VALUE;
                    } 
                    if(node.val % 2 != 0) return false;
                    if(lastValue <= node.val) return false;
                    else lastValue = node.val;
                }
            }
        return true;
    }
}

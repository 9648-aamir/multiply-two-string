public class Diagonalsuminbinarytree {
    public static ArrayList<Integer> diagonalSum(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
            
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int n = q.size(), sum = 0;
            
            while(n-- > 0) {
                Node p = q.peek();
                q.poll();
                
                while(p != null) {
                    sum += p.data;
                    
                    if(p.left != null)
                        q.add(p.left);
                        
                    p = p.right;
                }
            }
            
            res.add(sum);
        }
        
        return res;
    }
}

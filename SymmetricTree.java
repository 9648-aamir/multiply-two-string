public class SymmetricTree {
     // return true/false denoting whether the tree is Symmetric or not
   public static boolean isSymmetric(Node root)
   {
           // add your code here;
           return root == null || checkSymmetric(root.left, root.right);
   }
       
   public static boolean checkSymmetric(Node left, Node right)
   {
           // If only one of them is null, then left != right => returns false
           if(left == null || right == null) {
               return left == right;
           }
           
           // Check whether current node of both the subtrees are equal
           if(left.data != right.data) {
               return false;
           }
           
           // Mirror images are laterally inverted 
           // i.e., left == right and vice versa
           return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
   }
}

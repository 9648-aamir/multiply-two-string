import java.util.ArrayList;

public class Boundary_traversal_of_matrix {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> ls = new ArrayList<>();
        if (n == 1){
            for (int i = 0; i < m ; i++){
                ls.add(matrix[0][i]);
            }
        }
        else if (m == 1){
            for (int i = 0; i < n ; i++){
                ls.add(matrix[i][0]);
            }
        }
        else{
            for (int i = 0; i < m ; i++){
                ls.add(matrix[0][i]);
            }
            for (int i = 1; i < n ; i++){
                ls.add(matrix[i][m-1]);
            }
            m--;
            for (int i = m-1; i >= 0; i--){
                ls.add(matrix[n-1][i]);
            }
            n--;
            for (int i = n-1; i > 0; i--){
                ls.add(matrix[i][0]);
            }
        }
        return ls;
}
}

import java.util.ArrayList;

public class Sum_of_upper_and_lower_triangles {
     //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int upper_sum = 0;
        int lower_sum = 0;
        int diagonal_sum = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i<j){
                    upper_sum+=matrix[i][j];
                }
                else if(i>j){
                    lower_sum+=matrix[i][j];
                }
                else if(i==j){
                    diagonal_sum+= matrix[i][j];
                }
            }
        }
        
        ans.add(upper_sum+diagonal_sum);
        ans.add(lower_sum+diagonal_sum);
        
        return ans;
    }
}

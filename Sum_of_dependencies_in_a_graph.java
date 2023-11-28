import java.util.ArrayList;

public class Sum_of_dependencies_in_a_graph {
     int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        
         int sum=0;
        for(int i=0;i<V;i++){
               sum += adj.get(i).size();
        }
        return sum;
    }
}

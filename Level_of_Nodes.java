import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_of_Nodes {
    {
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[V];
        
        q.add(0);
        int c =0;
        
        while(!q.isEmpty()){
            int n=q.size();
           for(int i=0;i<n;i++){
               int node=q.poll();
               vis[node]=1;
               if(node==X)
               return c;
           for(int adjv:adj.get(node)){
              if(vis[adjv]==0){
              q.add(adjv);
               }
             }
           }
           c++;
        }
        return -1;
    }
}

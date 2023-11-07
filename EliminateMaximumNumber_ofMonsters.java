import java.util.PriorityQueue;

public class EliminateMaximumNumber_ofMonsters {
     public int eliminateMaximum(int[] dist, int[] speed) {
        int res=0;
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for(int i=0; i<dist.length; i++){
            double d = dist[i]*1f/speed[i]*1f;
            pq.add(d);
        }
        int time=0;
        while(!pq.isEmpty() && time<pq.peek()){
            pq.poll();
            res++;
            time++;
        }
        return res;
    }
}

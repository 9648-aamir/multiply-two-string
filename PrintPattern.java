import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public List<Integer> pattern(int N){
        // code here
        ArrayList <Integer> a = new ArrayList<>();
        int q=N;
        while(q>0){
            a.add(q);
            q=q-5;
        }
        int p=q;
        while( p<=N){
            a.add(p);
            p=p+5;
            
        }
        return a;
    }
}

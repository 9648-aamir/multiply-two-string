import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumMeetings_in_OneRoom {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[][] meeting = new int[N][3];
        for(int i=0; i<N; i++){
            meeting[i][0] = i;
            meeting[i][1] = S[i];
            meeting[i][2] = F[i];
        }
        Arrays.sort(meeting, Comparator.comparingDouble(o -> o[2]));
        list.add(meeting[0][0]+1);
        int lastEndTime = meeting[0][2];
        for(int i=1; i<N; i++){
            if(meeting[i][1] > lastEndTime){
                list.add(meeting[i][0]+1);
                lastEndTime = meeting[i][2];
            }
        }
        Collections.sort(list);
        return list;
        
        
    }
}

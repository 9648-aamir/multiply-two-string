import java.util.ArrayList;

public class Find_duplicates_in_an_array {
    class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            int ind = arr[i] % n;
            arr[ind] += n; // Use ind as an index to mark elements
        }
        for(int i = 0; i < n; i++) {
            if((arr[i] / n) >= 2) {
                a.add(i);
            }
        }

        if(a.size() == 0) {
            a.add(-1); // Add -1 to the list when there are no duplicates
            return a;
        }
        return a;
    }
}
}

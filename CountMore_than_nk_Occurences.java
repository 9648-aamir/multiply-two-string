import java.util.HashMap;
import java.util.Map;

public class CountMore_than_nk_Occurences {
    public int countOccurence(int[] arr, int n, int k) 
    {
        int len = arr.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n/k) {
                count++;
            }
        }
        return count;
    }
}

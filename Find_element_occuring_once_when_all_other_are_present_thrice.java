import java.util.HashMap;

public class Find_element_occuring_once_when_all_other_are_present_thrice {
    static int singleElement(int[] arr, int N) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}

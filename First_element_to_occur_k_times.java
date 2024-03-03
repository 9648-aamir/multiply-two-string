import java.util.HashMap;

public class First_element_to_occur_k_times {
    public int firstElementKTime(int n, int k, int[] a) {

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {

            if (!freq.containsKey(a[i])) {

                freq.put(a[i], 1);

            } else {

                freq.put(a[i], freq.get(a[i]) + 1);
            }

            if (freq.get(a[i]) == k)
                return a[i];
        }

        return -1;
    }
}

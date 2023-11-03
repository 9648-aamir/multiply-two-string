import java.util.HashSet;

public class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        // code here
         HashSet<Integer> set = new HashSet<>();

        // Calculate and store the squares of all elements in the array
        for (int i = 0; i < n; i++) {
            set.add(arr[i] * arr[i]);
        }

        // Check for triplets
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int squareSum = arr[i] * arr[i] + arr[j] * arr[j];
                if (set.contains(squareSum) && squareSum != arr[i] * arr[i] && squareSum != arr[j] * arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

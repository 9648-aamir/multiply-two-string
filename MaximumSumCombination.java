import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSumCombination {
    public static List<Integer> maxCombinations(int N, int K, int[] A, int[] B) {
    // Sort both arrays in descending order
    Arrays.sort(A);
    Arrays.sort(B);
    reverse(A);
    reverse(B);

    // Create a max heap to store the sum combinations and the indices
    PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
    heap.offer(new int[]{A[0] + B[0], 0, 0});

    // Create a hash set to store the visited pairs of indices
    HashSet<String> visited = new HashSet<>();
    visited.add("0,0");

    // Create a list to store the output
    List<Integer> output = new ArrayList<>();

    // Loop until the heap is empty or we have K elements in the output
    while (!heap.isEmpty() && output.size() < K) {
        // Pop the top element from the heap
        int[] top = heap.poll();
        // Add its sum to the output
        output.add(top[0]);
        // Get its indices
        int i = top[1];
        int j = top[2];
        // Push the next two possible pairs to the heap if not visited
        if (i + 1 < N && !visited.contains((i + 1) + "," + j)) {
            heap.offer(new int[]{A[i + 1] + B[j], i + 1, j});
            visited.add((i + 1) + "," + j);
        }
        if (j + 1 < N && !visited.contains(i + "," + (j + 1))) {
            heap.offer(new int[]{A[i] + B[j + 1], i, j + 1});
            visited.add(i + "," + (j + 1));
        }
    }

    // Return the output list
    return output;
}

// Helper function to reverse an array
public static void reverse(int[] arr) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
}

import java.util.ArrayList;

public class MaxSumSubarray_of_sizeK {
     static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        if (N < K) {
            return -1; // Invalid input
        }

        long maxSum = 0;
        long currentSum = 0;

        // Calculate the sum of the first subarray of size K
        for (int i = 0; i < K; i++) {
            currentSum += Arr.get(i);
        }
        maxSum = currentSum;

        // Start from the Kth element and iterate through the array
        for (int i = K; i < N; i++) {
            currentSum += Arr.get(i) - Arr.get(i - K); // Slide the window by adding the next element and removing the first element of the window
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    
}
}

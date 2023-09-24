import java.util.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking count of testcases
        int t = sc.nextInt();
        while (t-- > 0) {

            // taking count of houses
            int n = sc.nextInt();
            int arr[] = new int[n];

            // inserting money present in
            // each house in the array
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();

            // calling method FindMaxSum() of class solve
            System.out.println(new Solution().FindMaxSum(arr, n));
        }
    }
}

public class SticklerThief {
    // Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n) {
        if (n == 0)
            return 0;

        int prevMax = 0, currMax = 0;

        for (int i = 0; i < n; i++) {
            int maxAmount = Math.max(currMax, prevMax + arr[i]);
            prevMax = currMax;
            currMax = maxAmount;
        }

        return currMax;
    }
}

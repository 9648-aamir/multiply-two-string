import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 6};
        int k = 3; // Change K to find the Kth largest element

        int kthLargest = findKthLargest(arr, k);

        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length)
            throw new IllegalArgumentException("Invalid input");

        // Create a Max Heap (Priority Queue)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add elements from the array to the Max Heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        // Extract the Kth largest element from the Max Heap
        for (int i = 1; i < k; i++) {
            maxHeap.poll(); // Remove the largest (K-1) elements
        }

        return maxHeap.peek(); // Return the Kth largest element
    }
}

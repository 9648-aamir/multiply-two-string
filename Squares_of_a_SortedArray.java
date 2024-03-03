import java.util.Arrays;

public class Squares_of_a_SortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] t = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = nums[i] * nums[i];  // Square each element.
        }
        Arrays.sort(t); // Sort the squared values.
        return t; // Return the sorted squares.
    }
}

import java.util.Stack;

public class one_three_two_Pattern {
    public boolean find132pattern(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                return true;
            }
            while (!st.empty() && st.peek() < arr[i]) {
                min = st.pop();
            }
            st.push(arr[i]);
        }

        return false;
    }
}

public class Swapthearrayelements {
    public void swapElements(int[] arr, int n) {
        if (n <= 2) {
            return;
        }
        for (int i = 2; i < n; i++) {
            int t = arr[i - 2];
            arr[i - 2] = arr[i];
            arr[i] = t;
        }
    }
}

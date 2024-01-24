import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {6, 2, 4, 3, 8, 1, 7, 9, 0};

        int mid = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort the last half of the array
        Arrays.sort(arr, mid, arr.length);

        // Invert the last half of the array
        for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println();

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

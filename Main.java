import java.util.*;

public class Main {
    public static void findMinMax(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 3, 8, 5, 9, 7};
        findMinMax(arr);
    }
}

import java.util.*;
public class PrintNbitbinarynumberhavingmoresthans {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> result = new ArrayList<>();
        backtrack("", 0, 0, N, result);
        return result;
    }
    static void backtrack(String s, int ones, int zeros, int n, ArrayList<String> result) {
        if (s.length() == n) {
            result.add(s);
            return;
        }
        if (s.length() < n) backtrack(s + '1', ones + 1, zeros, n, result);
        if (ones > zeros) backtrack(s + '0', ones, zeros + 1, n, result);
    }
}

import java.util.*;

class MaximumLengthofPairChain {
    
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) return 1;
                if (o1[1] < o2[1]) return -1;
                return 0;
            }
        });

        int ans = 1;
        int prev = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > prev) {
                prev = pairs[i][1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumLengthofPairChain solution = new MaximumLengthofPairChain();

        int[][] pairs1 = {{1, 2}, {2, 3}, {3, 4}};
        int result1 = solution.findLongestChain(pairs1);
        System.out.println("Result 1: " + result1); // Expected output: 2

        int[][] pairs2 = {{1, 2}, {7, 8}, {4, 5}};
        int result2 = solution.findLongestChain(pairs2);
        System.out.println("Result 2: " + result2); // Expected output: 3
    }
}

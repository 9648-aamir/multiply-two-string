public class NewYearResolution {
    static boolean find(int[] coins, int n, int accumulated) {
        if (n < 0) {
            return false;
        }

        int take = coins[n] + accumulated;
        int not = accumulated;

        if (take % 24 == 0 || take % 20 == 0 || take == 2024) {
            return true;
        }
https://media.geeksforgeeks.org/img-practice/prod/courses/1/Web/Content/3-90-fab-v3_1703855049.svg
        return find(coins, n - 1, take) || find(coins, n - 1, not);
    }
    public static boolean isPossible(int N, int[] coins) {
        // code here
        return find(coins, N - 1, 0);
    }
}

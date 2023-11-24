import java.util.Arrays;

public class MaximumNumber_ofCoinsYouCanGet {
     public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;

        for (int i = piles.length / 3; i < piles.length; i += 2) {
            res += piles[i];
        }

        return res;        
    }
}

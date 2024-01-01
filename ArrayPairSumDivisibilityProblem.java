public class ArrayPairSumDivisibilityProblem {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if (nums == null || nums.length % 2 != 0) {
            return false;
        }
        int[] remainderFrequence = new int[k];

        for (int num : nums) {
            int remainder = (num % k + k) % k;
            remainderFrequence[remainder]++;
        }

        for (int i = 1; i < k; i++) {
            if (remainderFrequence[i] != remainderFrequence[k - i]) {
                return false;
            }
        }

        return remainderFrequence[0] % 2 == 0;
    }
}

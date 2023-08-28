import java.util.*;
class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // Initialize the hashmap with empty sets for each stone position
        for (int i = 0; i < n; i++) {
            map.put(stones[i], new HashSet<Integer>());
        }

        // The first stone can be reached with a jump length of 0
        map.get(stones[0]).add(0);

        // Traverse through each stone and possible jump length
        for (int i = 0; i < n; i++) {
            int stone = stones[i];
            HashSet<Integer> jumpLengths = map.get(stone);

            for (int jump : jumpLengths) {
                // Try jumps of length - 1, length, and length + 1
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && map.containsKey(stone + nextJump)) {
                        map.get(stone + nextJump).add(nextJump);
                    }
                }
            }
        }

        // Check if the last stone has any valid jump lengths
        return !map.get(stones[n - 1]).isEmpty();
    }
}
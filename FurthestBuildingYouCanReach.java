public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> bricksUsed = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                bricks -= diff;
                bricksUsed.offer(diff);

                if (bricks < 0) {
                    if (ladders > 0) {
                        bricks += bricksUsed.poll();
                        ladders--;
                    } else {
                        return i;
                    }
                }
            }
        }

        return heights.length - 1;
    }
}

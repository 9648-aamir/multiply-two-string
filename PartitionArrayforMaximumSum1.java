public abstract class PartitionArrayforMaximumSum1 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int sz = arr.length;
        int [] sumState = new int[sz];
        for(int currIndx = 0; currIndx < arr.length; currIndx++){
            int maxTillNow = arr[currIndx];
            for(int prevIndx = currIndx; prevIndx > Math.max(-1, currIndx - k); prevIndx--){
                maxTillNow = Math.max(maxTillNow, arr[prevIndx]);
                int segLen = currIndx - prevIndx + 1;
                int prevSegContri = ((prevIndx - 1 > -1) ? sumState[prevIndx-1] : 0);
                int currentSegContri = (maxTillNow * segLen);
                sumState[currIndx] = Math.max(prevSegContri + currentSegContri, sumState[currIndx]);
            }
        }
        return sumState[sz-1];
    }
}

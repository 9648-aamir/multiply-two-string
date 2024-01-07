public class SplitArrayLargestSum {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        int start = 1;
        int end = sum;
    
        while(start<=end) {
            int mid = (start+end)/2;
           
            if (isPosible(mid,K,arr)) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        
        return end+1;
    }
    
    static boolean isPosible(int mid,int k, int[] arr) {
    
        int sum = 0;
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
            if (arr[i]>mid) return false;
            if (sum>mid) {
                count++;
                sum = arr[i];
            }
        }
        if (sum<=mid) {
            count++;
        }
       
        if (k>=count) return true;
        return false;
    }
};
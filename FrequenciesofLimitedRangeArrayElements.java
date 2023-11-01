public class FrequenciesofLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    { int[] ans = new int[N+1];
        for(int num: arr) if(num <= N) ans[num]++;
        for(int i = 1; i <= N; i++) arr[i-1] = ans[i];}
}

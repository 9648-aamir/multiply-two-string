public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        int i =0;
        while(i<n-1)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            i+=2;
        }
    }
}

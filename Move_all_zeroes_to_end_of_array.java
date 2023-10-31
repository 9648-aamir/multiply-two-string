public class Move_all_zeroes_to_end_of_array {
    void pushZerosToEnd(int[] arr, int n) {
        int ind=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[ind++]=arr[i];
            }
        }
        for(int i=ind;i<n;i++)
        arr[i]=0;
    }
}

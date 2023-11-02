public class Minimum_distance_between_two_numbers {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int min=Integer.MAX_VALUE;
        int n1=-1;
        int val=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x||a[i]==y){
                if(a[i]!=val&&val!=-1){
                    min=Math.min(min,Math.abs(i-n1));
                    n1=i;
                    val=a[i];
                }else{
                    n1=i;
                    val=a[i];
                }
            }
        }
        if(min!=Integer.MAX_VALUE)  return min;
        else return -1;
    }
}

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int f, l;
        f = 0;
        l =  arr.length-1;
        long sumf = arr[f];
        long suml =arr[l];
        while(f != l){
            if(sumf>suml){
                l--;
                suml+=arr[l];
            } else if(suml>sumf){
                f++;
                sumf+=arr[f];
            } else {
                f++;
                sumf+=arr[f];
                l--;
                suml+=arr[l];
            }
        }
        if(sumf == suml){
            return f+1;
        }
        return -1;
    }
}

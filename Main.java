import java.util.*;
public class Main {
    public static int exponetialSearch(int[] arr, int target) {
        int n=arr.length;
        if(n==arr[0]){
            return 0;
        }
        int i=1;
        while(i<n && arr[i]<=target){
            i*=2;
        }
    return Arrays.binarySearch(arr,i/2,Math.min(i, n),target);
}
public static void main(String[] args) {
    int arr[]={1,3,5,7,9,11,13,14,15};
    int target = 13;

    int result = exponetialSearch(arr, target);

    if(result>=0){
        System.out.println("Element at the index:"+result);
    }else{
        System.out.println("Element is not found ");
    }
}
}
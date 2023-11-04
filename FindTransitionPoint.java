public class FindTransitionPoint {
    int transitionPoint(int arr[], int n) {
        // code here
        
        int low = 0;
        int high=n-1;
        int ind=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==1){
                ind=mid;
                high=mid-1;
            }
            else if(arr[mid]<1){
                low=mid+1;
            }
        }
        return ind;
    }
}

public class InorderTraversalandBST {
    static int isRepresentingBST(int arr[], int n)
    {
        // code here
        int c = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] < arr[i+1]){
            }
            else{
                c++;
                break;
            }
        }
        if(c != 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}

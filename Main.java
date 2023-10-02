public class Main{
    public static int  jmpSearch(int arr[], int target){
        int n = arr.length;
        int step=(int)Math.floor(Math.sqrt(n));

        int prev=0;

        while(arr[Math.min(step, n)-1]<target){
            prev=step;
            step+=(int )Math.floor(Math.sqrt(n));
            if(prev>=n){
                return -1;
            }
        }
        for(int i=prev;i<Math.min(step, n);i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target = 10;

        int result = jmpSearch(arr, target);
        if(result!=1){
            System.out.println("Element at the index:"+result);
        }else{
            System.out.println("not found");
        }
    }
}
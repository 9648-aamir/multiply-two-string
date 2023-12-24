public class Main {
    public static void findMinMax(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            System.out.print(" "+arr[i]);

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                continue;
            }
            System.out.print(" "+arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,0,5,6,1,0,1,0};
        findMinMax(arr);
    }
}

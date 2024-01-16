public class SequenceofSequence {
    static int ans;
    public Solution(){
        this.ans = 0;
    }
    static int numberSequence(int m, int n)
    {
        for(int i=1;i<=m;i++){
            findNumber(m,n,i,1);
        }
        return ans;
    }
    public static void findNumber(int m,int n,int num,int count){
        if(num>m){
            return;
        }
        if(count==n && num<=m){
            ans++;
            return;
        }
        
        int val = num*2;
        for(int i=val;i<=m;i++){
            findNumber(m,n,i,count+1);
        }
       
    }
}

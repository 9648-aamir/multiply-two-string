public class GoldMineProblem {
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        for(int i=1; i<M[0].length; i++){
            for(int j=0; j<M.length; j++){
                int max=M[j][i-1];
                
                if(j>0 && M[j-1][i-1] > max){
                    max=M[j-1][i-1];
                }
                if(j<M.length-1 && M[j+1][i-1]>max){
                    max=M[j+1][i-1];
                }
                M[j][i]+=max;
            }
        }
        int ans=0;
        int lc=M[0].length-1;
        for(int i=0; i<M.length; i++){
            if(M[i][lc]>ans){
                ans=M[i][lc];
            }
        }
        return ans;
    }
}

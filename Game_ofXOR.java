public class Game_ofXOR {
    static int gameOfXor(int N , int[] A) {
        // code here
        int ans = 0;
        if(N%2 == 0)    return ans;
        for(int i=0;i<N;i++)    ans ^= (i%2!=0?0:A[i]);
        return ans;
    }
}

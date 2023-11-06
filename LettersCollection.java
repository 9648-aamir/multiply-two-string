import java.util.ArrayList;
import java.util.List;

public class LettersCollection {
     static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        // code here
        List<Integer> list = new ArrayList<>();
        int[] delRow1 = {-1,-1,0,1,1,1,0,-1};
        int[] delCol1 = {0,1,1,1,0,-1,-1,-1};
        
        int[] delRow2 = {-2,-2,-2,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2};
        int[] delCol2 = {0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1};
        
        for(int i=0; i<q; i++){
            int hop = queries[i][0];
            int row = queries[i][1];
            int col = queries[i][2];
            int sum = 0;
                if(hop == 1){
                    for(int x=0; x<8; x++){
                        int r = row + delRow1[x];
                        int c = col + delCol1[x];
                        if(r >= 0 && r < n && c >= 0 && c < m){
                            sum += mat[r][c];
                        }
                    }
                }else{
                    for(int x=0; x<16; x++){
                        int r = row + delRow2[x];
                        int c = col + delCol2[x];
                        if(r >= 0 && r < n && c >= 0 && c < m){
                            sum += mat[r][c];
                        }
                    }
                }
            list.add(sum);
        }
        return list;
    }
}

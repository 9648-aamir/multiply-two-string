public class SpecialPositions_in_aBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int sumR = 0;
                int sumC = 0;
                if(mat[i][j]==1){
                    for(int k=0;k<mat.length;k++){
                        sumR+=mat[k][j];
                    }
                    for(int k=0;k<mat[0].length;k++){
                        sumC+=mat[i][k];
                    }
                }
                if(sumR+sumC==2) count++;
            }
        }
        return count;
    }
}

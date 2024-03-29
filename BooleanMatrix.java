import java.util.Arrays;

public class BooleanMatrix {
    void booleanMatrix(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;

        int row[] = new int[r];
        Arrays.fill(row, 0);

        int col[] = new int[c];
        Arrays.fill(col, 0);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }

    }
}

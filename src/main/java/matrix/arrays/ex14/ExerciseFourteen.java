package matrix.arrays.ex14;

import static java.lang.Math.random;
import static matrix.arrays.DifferentFunction.showArray;

public class ExerciseFourteen {
    public void function() {

        int m = (int) (10 + random() * 15);
        int n = (int) (random() * 10);
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j; k++) {
                int b = (int) (random() * m);
                if (array[b][j] != 1) {
                    array[b][j] = 1;
                } else {
                    k--;
                }
            }
        }

        showArray(array);
    }
}


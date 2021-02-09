package matrix.arrays.ex4;

import static functions.DifferentFunction.showArray;

public class ExerciseFour {
    public void function(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    array[i][j] = n - j;
                }
            }
        }

        showArray(array);
    }
}

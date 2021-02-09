package matrix.arrays.ex6;

import static functions.DifferentFunction.showArray;

public class ExerciseSix {
    public void function(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i <= j && j < n - i) || (n - i - 1 <= j && j <= i + 1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        showArray(array);
    }
}

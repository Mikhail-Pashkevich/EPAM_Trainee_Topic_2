package matrix.arrays.ex5;

import static functions.DifferentFunction.showArray;

public class ExerciseFive {
    public void function(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                array[i][j] = i + 1;
            }
            for (int j = n - i; j < n; j++) {
                array[i][j] = 0;
            }
        }

        showArray(array);
    }
}

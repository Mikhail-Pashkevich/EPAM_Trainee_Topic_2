package matrix.arrays.ex16;

import static matrix.arrays.DifferentFunction.showArray;

public class ExerciseSixteen {
    public void function(int n) {
        int[][] bufferArray = new int[2 * n - 1][2 * n - 1];
        int counter = 1;

        for (int i = n - 1, j = 0; j < n; i++, j++) {
            for (int i1 = i, j1 = j; i1 > i - n; i1--, j1++, counter++) {
                bufferArray[i1][j1] = counter;
            }
        }


        int i0 = (n - 1) / 2;
        int j0 = (n - 1) / 2;

        for (int i = n - 1, j = 0; j < n; i++, j++) {
            for (int i1 = i, j1 = j; i1 > i - n; i1--, j1++, counter++) {
                if (i1 < i0) {
                    bufferArray[i1 + n][j1] = bufferArray[i1][j1];
                }
                if (i1 > i0 + n - 1) {
                    bufferArray[i1 - n][j1] = bufferArray[i1][j1];
                }
                if (j1 < j0) {
                    bufferArray[i1][j1 + n] = bufferArray[i1][j1];
                }
                if (j1 > j0 + n - 1) {
                    bufferArray[i1][j1 - n] = bufferArray[i1][j1];
                }
            }
        }


        int[][] array = new int[n][n];
        for (int i = 0, i1 = i0; i < n; i++, i1++) {
            for (int j = 0, j1 = j0; j < n; j++, j1++) {
                array[i][j] = bufferArray[i1][j1];
            }
        }

        showArray(array);
    }
}

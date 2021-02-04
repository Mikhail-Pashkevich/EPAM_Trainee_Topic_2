package matrix.arrays.ex15;

import static matrix.arrays.DifferentFunction.showArray;

public class ExerciseFifteen {
    public void function(int[][] array) {
        int numberRow = array.length;
        int numberColumn = array[0].length;
        int max = array[0][0];

        for (int[] row : array) {
            for (int number : row) {
                if (max < number) {
                    max = number;
                }
            }
        }

        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                if (array[i][j] % 2 == 1) {
                    array[i][j] = max;
                }
            }
        }

        showArray(array);
    }
}

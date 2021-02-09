package matrix.arrays.ex8;

import static functions.DifferentFunction.showArray;

public class ExerciseEight {
    public void function(int[][] array, int k, int p) {
        int numberRow = array.length;
        int buffer;

        for (int i = 0; i < numberRow; i++) {
            buffer = array[i][k];
            array[i][k] = array[i][p];
            array[i][p] = buffer;
        }

        showArray(array);
    }
}

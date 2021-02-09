package matrix.arrays.ex13;

import static functions.DifferentFunction.showArray;

public class ExerciseThirteen {
    public void function(int[][] array) {

        sortIncrement(array);
        showArray(array);

        System.out.println();

        sortDecrement(array);
        showArray(array);
    }

    private void sortDecrement(int[][] array) {

        int numberRow = array.length;
        int numberColumn = array[0].length;
        for (int j = 0; j < numberRow; j++) {

            int indexMax;
            int buffer;
            for (int i = 0; i < numberColumn; i++) {

                indexMax = i;
                for (int k = i; k < numberColumn; k++) {
                    if (array[indexMax][j] < array[k][j]) {
                        indexMax = k;
                    }
                }

                buffer = array[i][j];
                array[i][j] = array[indexMax][j];
                array[indexMax][j] = buffer;
            }
        }
    }

    private void sortIncrement(int[][] array) {

        int numberRow = array.length;
        int numberColumn = array[0].length;
        for (int j = 0; j < numberRow; j++) {

            int indexMin;
            int buffer;
            for (int i = 0; i < numberColumn; i++) {

                indexMin = i;
                for (int k = i; k < numberColumn; k++) {
                    if (array[indexMin][j] > array[k][j]) {
                        indexMin = k;
                    }
                }

                buffer = array[i][j];
                array[i][j] = array[indexMin][j];
                array[indexMin][j] = buffer;
            }
        }
    }
}

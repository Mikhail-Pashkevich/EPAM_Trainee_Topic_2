package matrix.arrays.ex12;

import static functions.DifferentFunction.showArray;

public class ExerciseTwelve {
    public void function(int[][] array) {
        int numberRow = array.length;

        for (int i = 0; i < numberRow; i++) {
            array[i] = sortIncrement(array[i]);
        }
        showArray(array);

        System.out.println();

        for (int i = 0; i < numberRow; i++) {
            array[i] = sortDecrement(array[i]);
        }
        showArray(array);
    }

    private int[] sortIncrement(int[] array) {
        int arraySize = array.length;
        int indexMin;
        int buffer;

        for (int i = 0; i < arraySize; i++) {
            indexMin = i;
            for (int j = i; j < arraySize; j++) {
                if (array[indexMin] > array[j]) {
                    indexMin = j;
                }
            }
            buffer = array[i];
            array[i] = array[indexMin];
            array[indexMin] = buffer;

        }
        return array;
    }

    private int[] sortDecrement(int[] array) {
        int arraySize = array.length;
        int indexMax;
        int buffer;

        for (int i = 0; i < arraySize; i++) {
            indexMax = i;
            for (int j = i; j < arraySize; j++) {
                if (array[indexMax] < array[j]) {
                    indexMax = j;
                }
            }
            buffer = array[i];
            array[i] = array[indexMax];
            array[indexMax] = buffer;

        }
        return array;
    }
}

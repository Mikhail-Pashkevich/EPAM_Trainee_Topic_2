package line.arrays.sort.ex6;

import static functions.DifferentFunction.showArray;

public class ExerciseSix {
    // сортировка Шелла
    public void function(int[] array) {
        int arraySize = array.length;
        int i = 0;

        while (i < arraySize - 1) {
            if (i < 0) {
                i = 0;
            }
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                int buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;
                i--;
            }
        }

        showArray(array);
    }
}

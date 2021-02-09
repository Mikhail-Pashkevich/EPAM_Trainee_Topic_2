package line.arrays.sort.ex3;

import static functions.DifferentFunction.showArray;

public class ExerciseThree {
    // сортировка выбором
    public void function(int[] array) {
        int arraySize = array.length;

        for (int i = 0, max; i < arraySize; i++) {
            max = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            int buffer = array[max];
            array[max] = array[i];
            array[i] = buffer;
        }

        showArray(array);
    }
}

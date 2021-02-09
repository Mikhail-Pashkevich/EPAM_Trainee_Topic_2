package line.arrays.sort.ex4;

import static functions.DifferentFunction.showArray;

public class ExerciseFour {
    // сортировка обменом
    public void function(int[] array) {
        int arraySize = array.length;
        int counter = 0;

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    counter++;
                }
            }
        }

        showArray(array);
        System.out.println("Количество перестановок = " + counter);
    }
}
